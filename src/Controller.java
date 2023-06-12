import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextField sizeShim1;
    @FXML
    private TextField sizeShim2;
    @FXML
    private TextField sizeShim3;
    @FXML
    private TextField sizeShim4;
    @FXML
    private TextField sizeShim5;
    @FXML
    private TextField countShim1;
    @FXML
    private TextField countShim2;
    @FXML
    private TextField countShim3;
    @FXML
    private TextField countShim4;
    @FXML
    private TextField countShim5;
    @FXML
    private TextArea outResult;
    @FXML
    private TextField inputValue;




    @FXML
    protected void buttonClick() {
        setList();
        outResult.setText(ModText.getText(inputValue.getText().trim()));
    }

    private void setList(){
        ModList.setLisl(sizeShim1.getText().trim(), countShim1.getText(),
                sizeShim2.getText().trim(), countShim2.getText().trim(),
                sizeShim3.getText().trim(), countShim3.getText().trim(),
                sizeShim4.getText().trim(), countShim4.getText().trim(),
                sizeShim5.getText().trim(), countShim5.getText().trim());
    }
    @FXML
    protected void activCountShim1(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            countShim1.requestFocus();
        }
    }
    @FXML
    protected void activCountShim2(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            countShim2.requestFocus();
        }
    }
    @FXML
    protected void activCountShim3(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            countShim3.requestFocus();
        }
    }
    @FXML
    protected void activCountShim4(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            countShim4.requestFocus();
        }
    }
    @FXML
    protected void activCountShim5(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            countShim5.requestFocus();
        }
    }
    @FXML
    protected void activSizeShim2(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            sizeShim2.requestFocus();
        }
    }
    @FXML
    protected void activSizeShim3(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            sizeShim3.requestFocus();
        }
    }
    @FXML
    protected void activSizeShim4(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            sizeShim4.requestFocus();
        }
    }
    @FXML
    protected void activSizeShim5(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            sizeShim5.requestFocus();
        }
    }
    @FXML
    protected void activInputValue(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            inputValue.requestFocus();
        }
    }
    @FXML
    protected void getResult(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER) ) {
            buttonClick();
        }
    }
}
