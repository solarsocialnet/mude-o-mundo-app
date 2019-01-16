package net.solarsocial.changetheworld.causes.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_cause_list.*
import net.solarsocial.changetheworld.R
import net.solarsocial.changetheworld.causes.domain.Cause


class CauseListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cause_list, container, false)
    }

    private fun setupSelectedCausesAdapter(cause: Cause) {
        context?.let {
            selected_causes_pager.adapter = SelectedCausesPagerAdapter(it, cause)
        }
    }
}
