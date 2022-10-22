package com.example.wordsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordsapp.databinding.FragmentLetterListBinding

private var _binding: FragmentLetterListBinding? = null
private val binding get() = _binding!!

class LetterListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


}