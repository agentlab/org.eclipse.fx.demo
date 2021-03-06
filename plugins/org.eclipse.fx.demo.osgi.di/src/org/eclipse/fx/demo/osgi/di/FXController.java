package org.eclipse.fx.demo.osgi.di;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import javafx.fxml.FXML;

public class FXController {
    @Inject
    private PrintService service;

    @PostConstruct
    void created(IEclipseContext context) {
        System.err.println("Parent post construction");
    }

    @FXML
    void initialize() {
        System.err.println("Parent controller");
    }

    @FXML
    void sayHello() {
        service.print("Hello World!");
    }
}
