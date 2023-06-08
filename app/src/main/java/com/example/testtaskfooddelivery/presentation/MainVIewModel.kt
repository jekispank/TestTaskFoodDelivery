package com.example.testtaskfooddelivery.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testtaskfooddelivery.model.CategoryModel
import kotlinx.coroutines.launch

class MainVIewModel(
    private val getListOfCategoryUseCase: GetListOfCategoryUseCase
    private val application: Application
): ViewModel() {

    private var _listOfCategory = MutableLiveData<CategoryModel>()
    val listOfCategory: LiveData<CategoryModel> = _listOfCategory

    fun getListOfCategory() {
        viewModelScope.launch {
            val result = getListOfCategoryUseCase.getListOfCategoryUseCase
            _listOfCategory.value = result
        }
    }

}