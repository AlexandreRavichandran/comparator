module com.comparator.comparator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;

    opens com.comparator.comparator to javafx.fxml;

    exports com.comparator.comparator;
}