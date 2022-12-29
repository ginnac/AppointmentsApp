module appointments.appointmentsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens appointments.appointmentsapp to javafx.fxml;
    exports appointments.appointmentsapp;
}