package com.example.icerock_t1.repo.domain

data class RepositoryModel(

    val id: Int,
    val nodeId: String,
    val name: String,
    val fullName: String,
    val ownerDto: OwnerModel,
    val private: Boolean,
    val htmlUrl: String,
    val description: String?,
    val fork: Boolean,
    val url: String,
    val archiveUrl: String,
    val assigneesUrl: String,
    val blobsUrl: String,
    val branchesUrl: String,
    val collaboratorsUrl: String,
    val commentsUrl: String,
    val commitsUrl: String,
    val compareUrl: String,
    val contentsUrl: String,
    val contributorsUrl: String,
    val deploymentsUrl: String,
    val downloadsUrl: String,
    val eventsUrl: String,
    val forksUrl: String,
    val gitCommitsUrl: String,
    val gitRefsUrl: String,
    val gitTagsUrl: String,
    val gitUrl: String,
    val issueCommentUrl: String,
    val issueEventsUrl: String,
    val issuesUrl: String,
    val keysUrlsUrl: String,
    val labelsUrl: String,
    val languagesUrl: String,
    val mergesUrl: String,
    val milestonesUrl: String,
    val notificationsUrl: String,
    val pullsUrl: String,
    val releasesUrl: String,
    val sshUrl: String,
    val stargazersUrl: String,
    val statusesUrl: String,
    val subscribersUrl: String,
    val subscriptionUrl: String,
    val tagsUrl: String,
    val teamsUrl: String,
    val treesUrl: String,
    val cloneUrl: String,
    val mirrorUrl: String?,
    val hooksUrl: String,
    val svnUrl: String,
    val homepage: String?,
    val language: String,
    val forksCount: Int,
    val stargazersCount: Int,
    val watchersCount: Int,
    val size: Int,
    val defaultBranch: String,
    val openIssuesCount: Int,
    val isTemplate: Boolean,
    val topics: List<String>,
    val hasIssues: Boolean,
    val hasProjects: Boolean,
    val hasWiki: Boolean,
    val hasPages: Boolean,
    val hasDownloads: Boolean,
    val archived: Boolean,
    val disabled: Boolean,
    val visibility: String,
    val pushedAt: String,
    val createdAt: String,
    val updatedAt: String,
    val permissionsDto: PermissionsModel?,
    val templateRepository: String?
)


data class OwnerModel(

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
    val siteAdmin: Boolean
)

data class PermissionsModel(

    val admin: Boolean,
    val push: Boolean,
    val pull: Boolean
)
