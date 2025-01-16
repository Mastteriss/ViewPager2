package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewNameTV:TextView = view.findViewById(R.id.viewNameTV)
        val viewAuthorTV:TextView = view.findViewById(R.id.viewAuthorTV)
        val viewPagerIV:ImageView = view.findViewById(R.id.viewPagerIV)
        val viewPagerItem = arguments?.getSerializable("vp") as Picture
        viewNameTV.text = viewPagerItem.name
        viewAuthorTV.text = viewPagerItem.author
        viewPagerIV.setImageResource(viewPagerItem.imageView)
    }
}