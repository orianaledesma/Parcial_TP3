package edu.ar.parcial_tp3.Clases
import android.os.Parcel
import android.os.Parcelable

class Character (name: String?, status: String?): Parcelable {
        var name: String = ""
        var status: String = ""

        constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()
        )

        init {
            this.name = name!!
            this.status = status!!
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(name)
            parcel.writeString(status)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Character> {
            override fun createFromParcel(parcel: Parcel): Character {
                return Character(parcel)
            }

            override fun newArray(size: Int): Array<Character?> {
                return arrayOfNulls(size)
            }
        }


    }
