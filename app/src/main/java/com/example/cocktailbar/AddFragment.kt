package com.example.cocktailbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class AddFragment : Fragment() {

    private lateinit var btnSave : Button
    private lateinit var btnAdd : Button
    private lateinit var tvNameNec : TextView
    //private lateinit var tvDescNec : TextView
    private lateinit var tvIngri : TextView
    private lateinit var etName : EditText
    private lateinit var etDesc : EditText
    private lateinit var ivImage : ImageView
    private val fragmentViewModel : FragmentViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        btnSave = view.findViewById(R.id.save_btn)
        btnAdd = view.findViewById(R.id.add_ing_btn)
        tvNameNec = view.findViewById(R.id.name_nec_tv)
        //tvDescNec = view.findViewById(R.id.desc_nec_tv)
        tvIngri = view.findViewById(R.id.ingri_list_tv)
        etName = view.findViewById(R.id.name_et)
        etDesc = view.findViewById(R.id.desc_et)
        ivImage = view.findViewById(R.id.pic_tail_add_iv)

        btnSave.setOnClickListener {
            if (etName.text.toString().equals("")) tvNameNec.setVisibility(View.VISIBLE)
            else {
                var buffer : String = ""
                //fragmentViewModel.data.observe(viewLifecycleOwner, {
                //    buffer = it
                //})
                //buffer.add(Cocktail(etName.text.toString(), etDesc.text.toString(), tvIngri.text.toString()))
                val cocktail = Cocktail(etName.text.toString(), etDesc.text.toString(), tvIngri.text.toString())
                buffer = cocktail.toString()
                fragmentViewModel.update(buffer)
                val fragment = ListFragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.nav_container, fragment)?.commit()
            }
        }

        return view
    }
}