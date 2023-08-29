package com.android.recyclerviewproject.ListData

import com.android.recyclerviewproject.R
import com.android.recyclerviewproject.multi_type1
import com.android.recyclerviewproject.multi_type2

object MyList {
    private var contactList = mutableListOf(
        MyItem(
            R.drawable.pat_0,
            "철수1",
            "010-1234-1234",
            true,
            multi_type1
        ),
        MyItem(
            R.drawable.pat_0,
            "철수2",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수3",
            "010-1234-1234",
            false,
            multi_type1
        ),
        MyItem(
            R.drawable.pat_0,
            "철수4",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수5",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수6",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수7",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수8",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수9",
            "010-1234-1234",
            false,
            multi_type2
        ),
        MyItem(
            R.drawable.pat_0,
            "철수10",
            "010-1234-1234",
            false,
            multi_type2
        )
    )

    fun retrieveContactList(): List<MyItem> {
        return contactList
    }
}