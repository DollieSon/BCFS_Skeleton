module dollieson.bcfs_skeleton {
    requires javafx.controls;
    requires javafx.fxml;


    opens dollieson.bcfs_skeleton to javafx.fxml;
    exports dollieson.bcfs_skeleton;
}