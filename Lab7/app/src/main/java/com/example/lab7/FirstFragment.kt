package com.example.lab7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    private lateinit var navigateButton: Button
    private lateinit var nameEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigateButton = view.findViewById(R.id.navigateButton)
        nameEditText = view.findViewById(R.id.nameEditText)

        navigateButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            action.setName(name)
            findNavController().navigate(action)
        }
    }
}