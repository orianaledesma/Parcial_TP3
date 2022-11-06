package edu.ar.parcial_tp3.Holders
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import edu.ar.parcial_tp3.R


    class CharacterHolder (v: View) : RecyclerView.ViewHolder(v) {

        private var view: View

        init {
            this.view = v
        }

        fun setName(name: String) {
            val txt: TextView = view.findViewById(R.id.txt_name_card)
            txt.text = name
        }

        fun setStatus(status: String) {
            val txt: TextView = view.findViewById(R.id.txt_status)
            txt.text = status
        }

        fun getCardLayout(): CardView {
            return view.findViewById(R.id.txt_name_card)
        }

    }
