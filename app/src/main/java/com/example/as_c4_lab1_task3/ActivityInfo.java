package com.example.as_c4_lab1_task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {
    private TextView receptText;
    private TextView receptName;
    private ImageView receptImage;
    private ImageView receptIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String selectedCraft = getIntent().getStringExtra("name");
        receptText = (TextView) findViewById(R.id.receptText);
        receptName = (TextView) findViewById(R.id.receptName);
        receptImage = (ImageView) findViewById(R.id.receptView);
        receptIcon = (ImageView) findViewById(R.id.receptIcon);
        recept(selectedCraft);
        receptName.setText(selectedCraft);
    }
    public void recept(String receptName)
    {
        switch (receptName)
        {
            case "Borsch":
                receptImage.setImageResource(R.drawable.borsch);
                receptIcon.setImageResource(R.drawable.ic_borsch);
                receptText.setText("Говядина на косточке - 500г.\n" +
                        "Капуста- 400г\n" +
                        "3-4 картофелины\n" +
                        "1 морковь\n" +
                        "1 больша луковица\n" +
                        "3-4 зуба чеснока\n" +
                        "2 вкусных сладких свеклы. Можно предварительно попробовать. Безвкусная свекла будет просто бесполезна\n" +
                        "2-3 ст.л. томатной пасты. Можно использовать и нормальные, свежие помидоры или помидоры в собственном соку. Я пользуюсь обычно именно ими.\n" +
                        "2.ч.л соли.");
                break;
            case "Cesar":
                receptImage.setImageResource(R.drawable.cesar);
                receptIcon.setImageResource(R.drawable.ic_cesar);
                receptText.setText("Грудка куриная - 1 шт. (400 г)\n" +
                        "Капуста пекинская - 1 шт.\n" +
                        "Помидоры черри - 150-200 г\n" +
                        "Сыр твердый (желательно пармезан) - 50-70 г\n" +
                        "Хлеб белый - 3-4 ломтика\n" +
                        "Соль - по вкусу\n" +
                        "Масло оливковое - 6 ст.л. (для жарки)\n" +
                        "Перец черный молотый - 1 ч.л.\n" +
                        "Чеснок - 4 зубчика\n" +
                        "Майонез - 3-4 ст.л.");

                break;
            case "Blinchik":
                receptImage.setImageResource(R.drawable.blinchik);
                receptIcon.setImageResource(R.drawable.ic_blinchik);
                receptText.setText("Яйцо – 1 шт.\n" +
                        "Мука – 150 г.\n" +
                        "Молоко –150 мл.\n" +
                        "Подсолнечное масло – 15 мл.\n" +
                        "Соль (по вкусу) – 20 г.\n" +
                        "Сахар (по вкусу) – 20 г.");
                break;
            case "Milkshake":
                receptImage.setImageResource(R.drawable.mil);
                receptIcon.setImageResource(R.drawable.ic_milkshake);
                receptText.setText("Банан 2\n" +
                        "Молоко или кокосовое молоко 350 мл.\n" +
                        "Какао 2 ст. ложки\n" +
                        "Мед 1 ст. ложка\n" +
                        "Кокосовая стружка для присыпки");
                break;
            case "Spagetti":
                receptImage.setImageResource(R.drawable.spagetti);
                receptIcon.setImageResource(R.drawable.ic_spagetti);
                receptText.setText("Спагетти (или другие макаронные изделия) - 250 г\n" +
                        "Куриные бедра - 2 шт.\n" +
                        "Помидоры измельченные или томатный сок - 200 мл\n" +
                        "Чеснок - 1 зубчик\n" +
                        "Лук репчатый - 1 шт.\n" +
                        "Сыр твёрдый - 30 г\n" +
                        "Масло растительное - 2-3 ст. ложки\n" +
                        "Сахар (по желанию) - 1 ч. ложка\n" +
                        "Соль - по вкусу\n" +
                        "Перец свежемолотый - по вкусу\n" +
                        "Базилик сушеный - по вкусу\n" +
                        "Специи (на выбор) - по вкусу\n" +
                        "Зелень свежая (для подачи) - 1 веточка");
                break;
        }
    }
    public void goToCheck(View v)
    {
        Intent intent = new Intent(ActivityInfo.this, MainActivityList.class);
        startActivity(intent);
        finish();
    }
}