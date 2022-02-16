package com.example.icerock_t1.auth.domain

data class UserModel(

    val login: String,
    val id: Int,
    val nodeId: String,
    val avatarUrl: String,
    val gravatarId: String,
    val url: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followingUrl: String,
    val gistsUrl: String,
    val starredUrl: String,
    val subscriptionsUrl: String,
    val organizationsUrl: String,
    val reposUrl: String,
    val eventsUrl: String,
    val receivedEventsUrl: String,
    val type: String,
    val siteAdmin: Boolean,
    val name: String?,
    val company: String?,
    val blog: String,
    val location: String?,
    val email: String?,
    val hireable: Boolean,
    val bio: String?,
    val twitterUsername: String?,
    val publicRepos: Int,
    val publicGists: Int,
    val followers: Int,
    val following: Int,
    val createdAt: String,
    val updatedAt: String,
    val privateGists: Int,
    val totalPrivateRepos: Int,
    val ownedPrivateRepos: Int,
    val diskUsage: Int,
    val collaborators: Int,
    val twoFactorAuthentication: Boolean,
    val plan: PlanModel?
)


data class PlanModel(

    val name: String,
    val space: Int,
    val privateRepos: Int,
    val collaborators: Int
)
