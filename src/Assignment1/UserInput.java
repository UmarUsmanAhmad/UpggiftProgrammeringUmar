package Assignment1;

public class UserInput {
    //Attributes/Properties
    private int numChar;
    private int nRows;

    //Constructor with parameters
    public UserInput(int num, int copycount) {
        numChar = num;
        nRows = copycount;
    }

    //Method
    public void setText(String inputText) {
        nRows++;
        numChar = numChar + inputText.length();
    }

    //Method
    public int getNumChar() {

        return numChar;
    }

    //Method
    public int getRows() {

        return nRows;
    }
}








