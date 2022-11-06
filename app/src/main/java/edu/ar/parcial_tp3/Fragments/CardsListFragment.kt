package edu.ar.parcial_tp3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import edu.ar.parcial_tp3.R

class CardsListFragment : Fragment() {
lateinit var frag1: View
lateinit var button3: Button
lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
     super.onCreate(savedInstanceState)

    }

override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    frag1 = inflater.inflate(R.layout.fragment_cards_list, container, false)

    button3 = frag1.findViewById(R.id.button3)
    button2 = frag1.findViewById(R.id.button2)

    return frag1

    }
}