package test.itemdroprate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static test.itemdroprate.Rarity.*;

public class MainActivity extends AppCompatActivity {

    ItemPool _itemPool;
    TextView _textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _itemPool = new ItemPool();

        _itemPool.setItemPool(legend, 2);
        _itemPool.setItemPool(hero, 8);
        _itemPool.setItemPool(magic, 20);
        _itemPool.setItemPool(uncommon, 30);
        _itemPool.setItemPool(common, 40);

        _textView = (TextView) findViewById(R.id.txv_main);
        _textView.setBackgroundColor(Color.rgb(0, 0, 0));

        Button button = (Button) findViewById(R.id.btn_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (_itemPool.getItem()) {
                    case legend:
                        _textView.setTextColor(Color.rgb(255, 100, 0));
                        _textView.setText("Legend!!");
                        break;
                    case hero:
                        _textView.setTextColor(Color.rgb(255, 0, 255));
                        _textView.setText("Hero!");
                        break;
                    case magic:
                        _textView.setTextColor(Color.rgb(0, 0, 255));
                        _textView.setText("Magic");
                        break;
                    case uncommon:
                        _textView.setTextColor(Color.rgb(255, 255, 255));
                        _textView.setText("uncommon");
                        break;
                    case common:
                        _textView.setTextColor(Color.rgb(100, 100, 100));
                        _textView.setText("common");
                        break;
                }
            }
        });
    }
}
