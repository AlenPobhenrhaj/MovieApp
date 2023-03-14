package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0499549",
            title = "Ghilli",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "Mani Ratnam",
            actors = "Vijay, Some lady actress, Comedian, Multiple villains",
            plot = "A young kabaddi player gets caught up in a dangerous situation when he helps a girl escape from a gang of kidnappers in Ghilli.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxo1nWrSzdG5HkWPo6QZnA1htlFwMENpe203ypb29x9Q&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8CKw5T84psrsyKD864BopEYPJSsR8yJlbpBaq1q7P2g&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTp-WhRDKieI5DkhXnoSi-wMxmTkzyTGHpmNHZ9mkCWqw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqc-h7UducVsD3pCZuHPwwCggKuZ9AmMBFeKujeNP6Ug&s",
            ),
            rating = "7.9"
        ),

        Movie(
            id = "tt0416449",
            title = "Poove Unnakaghe",
            year = "2006",
            genre = "Action, Drama, Fantasy",
            director = "Olden day director",
            actors = "Vijay, Multiple actresses, Comedian uncle, No villains",
            plot = "Poove Unakkaga is a Tamil movie about a young man who aspires to become a successful politician, but his life takes a turn when he falls in love with a girl from a different background.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjAzNTkzNjcxNl5BMl5BanBnXkFtZTYwNDA4NjE3._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3zwZsFMIlU-aBxHco5I8pmnjxUfB88HT8DMVqLUYnqg&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-V3jSlbdHqsTRiQHvEfYJIo4-a1v3ITlbzwqExHkIiQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIQOHewRQBQ8-ZtkP7R9VXyNIFdiQD1pVu_31hTxhTPw&s"

            ),
            rating = "7.7"
        ),

        Movie(
            id = "tt0848228",
            title = "Pokkiri",
            year = "2012",
            genre = "Action, Sci-Fi, Thriller",
            director = "Upcoming director",
            actors = "Vijay(old school), Some lady actress, Comedian, One vile villain",
            plot = "Pokkiri is a Tamil movie about a young man who becomes an undercover police officer to take down a criminal gang and falls in love with a member of the gang in the process.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJBCFp_LkgleN3YEhhLiyYilbLtKR4LA6NXjDn_-XhTA&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT5vltXbMk6CufaJA2oEFAF7WD2wjn7ZzOvu-W5VDD&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRal2pekgzNEdavN7cswFTUdbeuyEL4ids9gdL4zSPA&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2IMtLq3IjmzJGzWfIFKlSiS0gP9-dmXBWra3V58Zl&s",
            ),
            rating = "8.1"
        ),

        Movie(
            id = "tt0993846",
            title = "Jilla",
            year = "2013",
            genre = "Biography, Comedy, Crime",
            director = "Martin Scorsese",
            actors = "Vijay, Some lady actress, Comedian, Multiple villains, Mohanlal",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmXre9SPMHH6bGnmzUobnv5IFV6DpSyTJpIce7BTc4ig&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRBvUnQaUfTXQOmr2_jMAI0c5h5huH9jHVXzOwZH7hzA&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMPFZVVEQcvgfPayOJWgZ6YLudQ_6idJV6JHp4bv4cpw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZunC0JhyKd7hRkA4lgQeGqcAkW8ukh3BIQD1BLIKq&s",
            ),
            rating = "8.2"
        ),

        Movie(
            id = "tt0816692",
            title = "Kathi",
            year = "2014",
            genre = "Adventure, Drama, Sci-Fi",
            director = "Not very sure",
            actors = "Vijay, Some lady actress, Comedian, White hindi villain guy",
            plot = "A gripping action-drama film that follows the story of a small-time criminal who transforms into a social activist, taking up the fight against injustice and corruption in society.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoogGRMb3WBl6e_WY1xT-20QKHPWYHQ2hRGRG0Ed4u&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDIK7x271tmyn_H7FtiTQMLqCh-1YjFDT7Jt9iplocWw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDIK7x271tmyn_H7FtiTQMLqCh-1YjFDT7Jt9iplocWw&s",
            ),
            rating = "8.6"
        ),
        Movie(
            id = "tt0944947",
            title = "Mersal",
            year = "2011 - 2018",
            genre = "Adventure, Drama, Fantasy",
            director = "N/A",
            actors = "Vijay, Some lady actress, Comedian, Multiple villains",
            plot = "\"Mersal\" is a Tamil movie that revolves around the story of a magician and a doctor who seek revenge against a corrupt politician and his associates while also highlighting the issues faced by the healthcare industry.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjM5OTQ1MTY5Nl5BMl5BanBnXkFtZTgwMjM3NzMxODE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJP9igK3IftIISfp-dad-sgWOwoCQA4byeO3oqymDB&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKGp8rUVnTZF5f5QzgoIyxighq5VFWoeWnJXiuxUA5ng&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0evMFuoVuxIJsgfuAeUUdNS19tGquYuo0brVJ2ylUiA&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHi7M-zfMHvsCBKqsFZVCjjSuEgbZA9tDaILAOcU48xA&s",
            ),
            rating = "9.5"
        ),


        Movie(
            id = "tt2306299",
            title = "Master",
            year = "2013–2020",
            genre = "Action, Drama, History",
            director = "N/A",
            actors = "Vijay, Some lady actress, Comedian, Bhavani(Makkal Selvan)",
            plot = "\"Master\" is a Tamil movie that follows the story of a young professor who confronts a gangster to reform a juvenile correctional institution, while also delving into the themes of redemption, friendship, and self-discovery.",
            poster = "http://ia.media-imdb.com/images/M/MV5BOTEzNzI3MDc0N15BMl5BanBnXkFtZTgwMzk1MzA5NzE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMmvmZ85QgqCkvFQW4c16glTY63wG1S4bMDLyRCTNt&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfnrr993QX_I94DiGf9ael9StihvGrg5EcLdXj7M63&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSV1VuiVORUXYjmLtYZObqZMVJfjGoixzfVoB4SCJ2&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZu4Vweyqp2-OXeYivLWugn9EkFq7NcMxeWtRsvhXf-A&s",
            ),
            rating = "9.5"
        ),

        Movie(
            id = "tt0903747",
            title = "Beast",
            year = "2008–2013",
            genre = "Crime, Drama, Thriller",
            director = "N/A",
            actors = "Vijay, Some lady actress, Comedian, Multiple villains",
            plot = "Leaner,Meaner, Stronger...Can you feel the fire!!",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTQ0ODYzODc0OV5BMl5BanBnXkFtZTgwMDk3OTcyMDE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROlPrIaOAbZ9Mi5yiRTSBpzNfPnFm1Cjm-xlC_Qmkt7g&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSy7m4dj3TpC0AF4iI7zqsjzpH-plKpsaLmunFlMkqIhw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvIw_5a7Kc7vZaq8-SlmjUBmHx-836MIaxfx5BYk64&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhfGvwdXKTUhHzNPROrZloWH4v1_cptnkOGOU4G-nCyA&s",
            ),
            rating = "9.5"
        ),

        Movie(
            id = "tt2707408",
            title = "Varisu",
            year = "2015-",
            genre = "Biography, Crime, Drama",
            director = "N/A",
            actors = "Vijay, Some lady actress, Comedian, Multiple villains",
            plot = "\"Varisu\" is a Tamil movie that portrays the complex family dynamics and power struggles that ensue when the patriarch of a wealthy family passes away, leaving behind a massive fortune and a web of secrets and conflicts among his heirs",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTU0ODQ4NDg2OF5BMl5BanBnXkFtZTgwNzczNTE4OTE@._V1_SX300.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDoEcNLHbFTkT3eSdYY7FzKAdN-XI80S0ABEAiv0E-Qw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTFjizjeCIoLaGBg6Xhg9dyrgBOz5L4Vz1Qcv6eE4H7g&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqtnIBqhW5CNT-MXp6f6kyLuTjAcSchknqzjnUvb1uTQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFrOJEtVNvQs6xydd6FS5FRvxO5el2rT6iz6250t0uMw&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4Za3kNUTsykKesYiWxKuVtpJms6rqf2Lf0JpRNXW_&s",
            ),
            rating = "9.5"
        ),

        )
}
