package com.example.android.newsappp1;

import java.util.Date;

/**
 * An {@link Article} object contains information related to a single article.
 */
class Article {

    /**
     * Title of the article
     */
    private final String articleTitle;

    /**
     * Section name of the news
     */
    private final String articleSectionName;

    /**
     * Author name of the news
     */
    private final String articleAuthorName;

    /**
     * Publication date of the news
     */
    private final Date articlePublicationDate;

    /**
     * Website URL of the news
     */
    private final String articleUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title           is the title of the article
     * @param section         is the section where the article is published
     * @param authorFullName  is the article author full name
     * @param publicationDate is the article publication date
     * @param url             is the website URL to find more details about the article
     */
    public Article(String title, String section, String authorFullName, Date publicationDate, String url) {
        articleTitle = title;
        articleSectionName = section;
        articleAuthorName = authorFullName;
        articlePublicationDate = publicationDate;
        articleUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return articleTitle;
    }

    /**
     * Returns the section name of the article.
     */
    public String getSectionName() {
        return articleSectionName;
    }

    /**
     * Returns the author of the article.
     */
    public String getAuthorName() {
        return articleAuthorName;
    }

    /**
     * Returns the publication date of the article.
     */
    public Date getPublicationDate() {
        return articlePublicationDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return articleUrl;
    }
}