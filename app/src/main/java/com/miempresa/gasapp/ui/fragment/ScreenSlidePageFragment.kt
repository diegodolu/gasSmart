package com.miempresa.gasapp.ui.fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.miempresa.gasapp.R
import com.miempresa.gasapp.databinding.FragmentHomeSlideItemBinding
import com.miempresa.gasapp.model.Sensor
import com.miempresa.gasapp.ui.activity.RegisterTankActivity
import com.miempresa.gasapp.ui.dialog.RegisterSensorDialogFragment

class ScreenSlidePageFragment(private val sensor: Sensor) : Fragment() {
    private var _binding: FragmentHomeSlideItemBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeSlideItemBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.tvSensorCode.text =  "Sensor ${sensor.code}"

        binding.btnAddSensor.setOnClickListener {
            val dialog = RegisterSensorDialogFragment()
            dialog.show(parentFragmentManager, "RegisterSensorDialogFragment")
        }
        return root
        //val view = inflater.inflate(R.layout.fragment_home_slide_item, container, false)
        //val textViewSensorCode: TextView = view.findViewById(R.id.tv_sensor_code)
        //textViewSensorCode.text = "Sensor ${sensor.code}"
        //return view
    }
        //inflater.inflate(R.layout.fragment_home_slide_item, container, false)
}