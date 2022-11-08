package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test

    public void countChartest() {
        UserInput data = new UserInput(0, 0);
        data.setText("Umar");
        data.setText("Alex");
        data.setText("Siri");


        int expected_Char = 12;

        assertEquals(expected_Char, data.getNumChar());
    }

    @Test
    public void countRowstest() {
        UserInput data = new UserInput(0, 0);
        data.setText("Umar");
        data.setText("Alex");
        data.setText("Siri");

        int expected_Rows = 3;


        assertEquals(expected_Rows, data.getRows());
    }

    @Test

    public void RowsandChartest() {
        UserInput data = new UserInput(0, 0);
        String[] cars = {"Umar", "Abd", "Shoz", "stop"};
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase("Stop")) {
                break;

            }
            data.setText(cars[i]);
        }
        int expected_Rows =3 ;
        int expected_Char = 11;

        assertEquals(expected_Char, data.getNumChar());

        assertEquals(expected_Rows, data.getRows());

    }
}
