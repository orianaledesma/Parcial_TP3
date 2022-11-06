package edu.ar.parcial_tp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar
import edu.ar.parcial_tp3.`interface`.rickAndMortyAPI
import edu.ar.parcial_tp3.api.RickAndMortyService
import edu.ar.parcial_tp3.data.Character
import edu.ar.parcial_tp3.data.CharactersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.list_view)

        getCharacters()

    }

    fun getCharacters() {
        val baseURL = getString(R.string.url_api)

        val service = RickAndMortyService.create(baseURL);

        service.getListCharacters()?.enqueue(
            object : retrofit2.Callback<CharactersResponse?> {
            override fun onResponse(
                call: Call<CharactersResponse?>,
                response: Response<CharactersResponse?>
            ) {
                if (response.isSuccessful) {
                    val info = response.body()
                     val response: CharactersResponse? = (info as CharactersResponse)!!
                     val characters : MutableList<Character> = (response?.result  as List<Character>).toMutableList()

                }
            }
            override fun onFailure(call: Call<CharactersResponse?>, t: Throwable) {
                Log.e("Example", t.stackTraceToString())
                Snackbar.make(findViewById(R.id.list_view), "Metodo ondCreate", Snackbar.LENGTH_LONG).show()
            }
        })
    }


}




