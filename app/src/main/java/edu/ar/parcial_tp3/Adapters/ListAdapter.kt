package edu.ar.parcial_tp3.Adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import android.text.TextUtils
import androidx.recyclerview.widget.RecyclerView
import edu.ar.parcial_tp3.Holders.CharacterHolder
import edu.ar.parcial_tp3.R
import edu.ar.parcial_tp3.Clases.Character



class ListAdapter (
        private val characterList: MutableList<Character>
    ) : RecyclerView.Adapter<CharacterHolder>() {

        override fun getItemCount() = characterList.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
            val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
            return (CharacterHolder(view))
        }

        override fun onBindViewHolder(holder: CharacterHolder, position: Int) {
            val character = characterList[position]
            holder.setName(TextUtils.concat(character.name, " (", character.status, ")").toString())
            holder.setStatus(character.status)

            }
        }

