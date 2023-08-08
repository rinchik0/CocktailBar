package com.example.cocktailbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class ListFragment : Fragment() {

    val fragmentViewModel : FragmentViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        //val layout : LinearLayout = view.findViewById(R.id.list_tails)
        //val cocktailAdapter = CocktailAdapter(requireContext())
        var dynamicTextView : TextView = view.findViewById(R.id.list_tv)
        //dynamicTextView.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        //layout.addView(dynamicTextView)
        var buffer : String = ""
        fragmentViewModel.data.observe(viewLifecycleOwner, {
            buffer = it
        })
        if (!buffer.equals("")) {dynamicTextView.text = buffer}
        else {dynamicTextView.text = "Пусто"}

            //if (buffer.getAll().size != 0) {
            //    for (i in buffer.getAll()){
            //        dynamicTextView = cocktailAdapter.drawOne(i)
                    //layout.addView(dynamicTextView)
            //    }

        //else {
        //    val fragment = EmptyListFragment()
        //    val transaction = fragmentManager?.beginTransaction()
        //    transaction?.replace(R.id.nav_container, fragment)?.commit()
        //}

        return view
    }
}