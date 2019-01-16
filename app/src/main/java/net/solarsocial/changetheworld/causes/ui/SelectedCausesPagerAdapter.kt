package net.solarsocial.changetheworld.causes.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.bumptech.glide.Glide
import com.google.android.gms.common.util.ArrayUtils

import net.solarsocial.changetheworld.R
import net.solarsocial.changetheworld.causes.domain.Cause

import java.util.ArrayList
import androidx.viewpager.widget.PagerAdapter

class SelectedCausesPagerAdapter(private val context: Context, private val cause: Cause) : PagerAdapter() {
    private val images: ArrayList<String> = ArrayUtils.toArrayList(cause.imageUrl)

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val imageUrl = images[position]
        val layout = inflater.inflate(R.layout.object_details_image, collection, false) as ViewGroup
        val pagerImage = layout.findViewById<ImageView>(R.id.pagerImage)
        Glide.with(context).load(imageUrl).into(pagerImage)
        collection.addView(layout)
        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)
    }

    override fun getCount(): Int {
        return this.images.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view === obj
    }
}
