package net.solarsocial.changetheworld.causes.domain

data class Cause(
        val name: String,
        val shortDescription: String,
        val type: Array<Type>,
        val category: Category,
        val mainImageUrl: String,
        val imageUrl: Array<String>,
        val physicalAddress: String,
        val phoneNumber: String,
        val webAddress: String,
        val distance: Float
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cause

        if (name != other.name) return false
        if (shortDescription != other.shortDescription) return false
        if (!type.contentEquals(other.type)) return false
        if (category != other.category) return false
        if (mainImageUrl != other.mainImageUrl) return false
        if (!imageUrl.contentEquals(other.imageUrl)) return false
        if (physicalAddress != other.physicalAddress) return false
        if (phoneNumber != other.phoneNumber) return false
        if (webAddress != other.webAddress) return false
        if (distance != other.distance) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + shortDescription.hashCode()
        result = 31 * result + type.contentHashCode()
        result = 31 * result + category.hashCode()
        result = 31 * result + mainImageUrl.hashCode()
        result = 31 * result + imageUrl.contentHashCode()
        result = 31 * result + physicalAddress.hashCode()
        result = 31 * result + phoneNumber.hashCode()
        result = 31 * result + webAddress.hashCode()
        result = 31 * result + distance.hashCode()
        return result
    }
}