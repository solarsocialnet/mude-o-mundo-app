package net.solarsocial.changetheworld.common.di

import android.content.Context
import net.solarsocial.changetheworld.causes.data.repository.CausesApi
import net.solarsocial.changetheworld.causes.data.repository.CausesRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


fun appModule(appContext: Context) = Kodein.Module("appModules") {
    bind<Context>() with provider { appContext }

    import(backendModules())
    import(repositoryModules())
}

fun backendModules() = Kodein.Module("backendModules") {
    // TODO: complete this
    bind<CausesApi>() with singleton { CausesApi.create() }

}

fun repositoryModules() = Kodein.Module("repositoryModules") {
    // TODO: complete this
    bind<CausesRepository>() with singleton { CausesRepository(instance(), instance()) }
}
