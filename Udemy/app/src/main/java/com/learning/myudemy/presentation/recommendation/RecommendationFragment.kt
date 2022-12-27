package com.learning.myudemy.presentation.recommendation

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learning.myudemy.R
import com.learning.myudemy.databinding.FragmentRecommendationBinding
import com.learning.myudemy.domain.Lecture
import com.learning.myudemy.presentation.adapter.LectureAdapter
import com.learning.myudemy.presentation.base.LifecycleFragment
import timber.log.Timber

@BindingAdapter("lectureList")
fun bindRecyclerView(view: RecyclerView,list:List<Lecture>){
    val adapter = LectureAdapter(){}
    adapter.submitList(list)
    view.adapter = adapter
    view.layoutManager = LinearLayoutManager(view.rootView.context,LinearLayoutManager.HORIZONTAL,false)
}

class RecommendationFragment : LifecycleFragment() {

    lateinit var binding : FragmentRecommendationBinding
    private val viewModel: RecommendationViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recommendation, container, false)
        Timber.tag("lifecycle").d("${this.javaClass.simpleName} : ${object{}.javaClass.enclosingMethod.name}")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.webList = viewModel.webLectures
        binding.reactList = viewModel.reactLectures
        binding.pythonList = viewModel.pythonLectures
        binding.webTitle="웹 관련강의"
        binding.reactTitle="리엑트 관련강의"
        binding.pythonTitle="파이썬 관련강의"

    }

}