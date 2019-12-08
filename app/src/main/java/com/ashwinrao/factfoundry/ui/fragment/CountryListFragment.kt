package com.ashwinrao.factfoundry.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ashwinrao.factfoundry.R
import com.ashwinrao.factfoundry.databinding.FragmentCountryListBinding
import com.ashwinrao.factfoundry.extra_detail_activity
import com.ashwinrao.factfoundry.ui.CountriesListAdapter
import com.ashwinrao.factfoundry.ui.activity.DetailActivity
import com.ashwinrao.factfoundry.util.RecyclerViewDecorations

class CountryListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CountriesListAdapter
    private lateinit var countriesList: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        countriesList =
            this.context?.resources?.getStringArray(R.array.countries_array)?.toMutableList()!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCountryListBinding.inflate(inflater)
        recyclerView = binding.recyclerView
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeRecyclerView()
    }

    private fun initializeRecyclerView() {
        adapter = CountriesListAdapter(countriesList) { position -> startDetailActivity(position) }
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            GridLayoutManager(this.requireContext(), 1, RecyclerView.VERTICAL, false)
        RecyclerViewDecorations.addItemDecoration(requireContext(), recyclerView, 1, 0f)
        recyclerView.adapter = adapter
    }

    private fun startDetailActivity(position: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra(extra_detail_activity, countriesList[position])
        startActivity(intent)
    }

}