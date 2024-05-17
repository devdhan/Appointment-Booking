package com.example.play.screens

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.play.R
import com.example.play.databinding.FragmentSignUpBinding

class SignUp : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.datechange.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                requireContext(),
                R.style.CustomDatePickerDialog, // Apply custom style here
                DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDay ->
                    val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    binding.datechange.setText(selectedDate)
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }

        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                Toast.makeText(requireContext(), "I AGREE ON ${Calendar.getInstance().time}", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked){
                Toast.makeText(requireContext(), "SIGNED UP SUCCESSFUL ON ${Calendar.getInstance().time}", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(requireContext(), "TICK THE CHECK BOX", Toast.LENGTH_SHORT).show()
            }
        }
    }
}