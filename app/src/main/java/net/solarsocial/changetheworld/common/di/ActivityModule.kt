package net.solarsocial.changetheworld.common.di

import android.app.Activity
import android.content.Context
import net.solarsocial.changetheworld.causes.domain.CausesUseCase
import net.solarsocial.changetheworld.causes.domain.interactor.CausesInteractor
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

fun baseActivityModule(activity: Activity) = Kodein.Module("activityModule") {
    bind<Context>(overrides = true) with provider { activity }
    bind<Activity>() with provider { activity }

    // TODO: this is a sample, implement the use cases using this as base
    bind<CausesUseCase>() with provider { CausesInteractor(instance()) }
}
