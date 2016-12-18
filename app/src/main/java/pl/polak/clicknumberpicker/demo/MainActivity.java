package pl.polak.clicknumberpicker.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import pl.polak.clicknumberpicker.ClickNumberPickerListener;
import pl.polak.clicknumberpicker.ClickNumberPickerView;
import pl.polak.clicknumberpicker.PickerClickType;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ClickNumberPickerView picker = (ClickNumberPickerView) findViewById(R.id.my_picker_01);
        final ClickNumberPickerView picker_02 = (ClickNumberPickerView) findViewById(R.id.my_picker_02);

        picker.setClickNumberPickerListener(new ClickNumberPickerListener() {
            @Override
            public void onValueChange(float previousValue, float currentValue, PickerClickType pickerClickType) {

                Log.d(this.getClass().getSimpleName(), "test");
                Log.d(this.getClass().getSimpleName(), String.valueOf(picker.getValue()));

                Toast.makeText(getApplication(),String.valueOf(picker.getValue()),LENGTH_LONG).show();
            }
        });

        picker_02.setClickNumberPickerListener(new ClickNumberPickerListener() {
            @Override
            public void onValueChange(float previousValue, float currentValue, PickerClickType pickerClickType) {

                Log.d(this.getClass().getSimpleName(), "test");
                Log.d(this.getClass().getSimpleName(), String.valueOf(picker_02.getValue()));

                Toast.makeText(getApplication(),String.valueOf(picker_02.getValue()),LENGTH_LONG).show();


            }
        });

    }
}
