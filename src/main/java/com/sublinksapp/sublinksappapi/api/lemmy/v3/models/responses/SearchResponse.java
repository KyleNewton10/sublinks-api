package com.sublinksapp.sublinksappapi.api.lemmy.v3.models.responses;

import com.sublinksapp.sublinksappapi.api.lemmy.v3.enums.SearchType;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views.CommentView;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views.CommunityView;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views.PersonView;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views.PostView;
import lombok.Builder;

import java.util.List;

@Builder
public record SearchResponse(
        SearchType type_,
        List<CommentView> comments,
        List<PostView> posts,
        List<CommunityView> communities,
        List<PersonView> users
) {
}