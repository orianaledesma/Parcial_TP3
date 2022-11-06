package edu.ar.parcial_tp3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.ar.parcial_tp3.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import edu.ar.parcial_tp3.Adapters.ListAdapter
import edu.ar.parcial_tp3.Clases.Character



class CardsListFragment : Fragment() {

    lateinit var v: View

    lateinit var characterList: RecyclerView

    var characters: MutableList<Character> = ArrayList<Character>()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var characterListAdapter: ListAdapter

    companion object {
        fun newInstance() = CardsListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.item_card, container, false)
    }

    override fun onStart() {
        super.onStart()

        for (i in 1..10) {
            characters.add(Character("Rick Sanchez", "Alive"))
            characters.add(Character("Morty Smith", "Death"))
            characters.add(Character("Rick Sanchez", "Alive"))
            characters.add(Character("Morty Smith", "Death"))

        }

        characterList.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)

        characterList.layoutManager = linearLayoutManager

        characterListAdapter = ListAdapter(characters)

        characterList.adapter = characterListAdapter

    }
}

