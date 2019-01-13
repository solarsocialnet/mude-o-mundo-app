package net.solarsocial.changetheworld

import android.app.Application
import com.facebook.stetho.Stetho
import net.solarsocial.changetheworld.common.di.appModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import timber.log.Timber

class ChangeTheWorldApplication : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        import(appModule(applicationContext))
    }

    override fun onCreate() {
        super.onCreate()

        Stetho.initializeWithDefaults(this)
        Timber.plant(Timber.DebugTree())
    }

}
