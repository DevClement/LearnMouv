package fr.clement.learnmouv

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity()  {

    private var activityFrench: CardView? = null;
    private var activityEconomy: CardView? = null;
    private var activityLaw: CardView? = null;
    private var activityDevelopment: CardView? = null;
    private var activityNetwork: CardView? = null;
    private var activityEnglish: CardView? = null;
    private var activityMathematical: CardView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        this.activityFrench = findViewById(R.id.french);
        this.activityEconomy = findViewById(R.id.economy)
        this.activityLaw = findViewById(R.id.law)
        this.activityDevelopment = findViewById(R.id.development)
        this.activityNetwork = findViewById(R.id.network)
        this.activityEnglish = findViewById(R.id.english)
        this.activityMathematical = findViewById(R.id.mathematical)

        this.activityFrench?.setOnClickListener {
            selectMenu(this.activityFrench);
        }

        this.activityEconomy?.setOnClickListener {
            selectMenu(this.activityEconomy);
        }

        this.activityLaw?.setOnClickListener {
            selectMenu(this.activityLaw);
        }

        this.activityDevelopment?.setOnClickListener {
            selectMenu(this.activityDevelopment);
        }

        this.activityNetwork?.setOnClickListener {
            selectMenu(this.activityNetwork);
        }

        this.activityEnglish?.setOnClickListener {
            selectMenu(this.activityEnglish);
        }

        this.activityMathematical?.setOnClickListener {
            selectMenu(this.activityMathematical);
        }
    }

    fun setDefaultColor(): Void? {
        this.activityFrench?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityEconomy?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityLaw?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityDevelopment?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityNetwork?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityEnglish?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        this.activityMathematical?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorBackground));
        return null
    }

    fun selectMenu(ActivitySelected: CardView?): Void? {
        setDefaultColor();
        ActivitySelected?.setCardBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorOther));
        return null;
    }

}