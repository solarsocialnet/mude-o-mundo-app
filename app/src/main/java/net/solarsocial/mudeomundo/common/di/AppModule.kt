package net.solarsocial.mudeomundo.common.di

import android.content.Context
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider


fun appModule(appContext: Context) = Kodein.Module("appModules") {
    bind<Context>() with provider { appContext }
}
