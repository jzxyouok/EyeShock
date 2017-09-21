package com.glumes.databindingadapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by zhaoying on 2017/9/20.
 */

public class BindingViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding mBinding;

    public BindingViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }


    /**
     * bind whole data
     */
    public void bind() {

        mBinding.executePendingBindings();
    }

    public void bind(Object item) {
        mBinding.setVariable(com.glumes.databindingadapter.BR.viewModel, item);
        mBinding.executePendingBindings();
    }
}