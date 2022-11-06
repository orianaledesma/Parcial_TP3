package edu.ar.parcial_tp3.Clases
import android.os.Parcel
import android.os.Parcelable

class Personaje (nombre: String?, status: String?): Parcelable {
        var nombre: String = ""
        var status: String = ""

        constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()
        )

        init {
            this.nombre = nombre!!
            this.status = status!!
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(nombre)
            parcel.writeString(status)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Personaje> {
            override fun createFromParcel(parcel: Parcel): Personaje {
                return Personaje(parcel)
            }

            override fun newArray(size: Int): Array<Personaje?> {
                return arrayOfNulls(size)
            }
        }


    }
