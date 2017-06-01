package com.x7.ssad.ticketsystem.Cache;

import android.util.Log;

import com.x7.ssad.ticketsystem.Model.BoxOffice;
import com.x7.ssad.ticketsystem.Model.Cinema;
import com.x7.ssad.ticketsystem.Model.Movie;
import com.x7.ssad.ticketsystem.Model.MovieComment;
import com.x7.ssad.ticketsystem.Model.StaffInfo;
import com.x7.ssad.ticketsystem.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by WangYinghao on 5/26/17.
 */

//TODO: implement a real movie cache system
public class MovieCacheStub {

    List<Movie> movie_list;

    public MovieCacheStub() {

        movie_list = new ArrayList<>();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        try {

            //temp data
            List<StaffInfo> staffList = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                StaffInfo myStaffInfo = new StaffInfo(R.mipmap.johnny_depp,
                        "约翰尼·德普133", "饰 杰克船长333333");
                staffList.add(myStaffInfo);
            }

            int movieshotIdList[] = {R.mipmap.movie_shot, R.mipmap.movie_shot,
                    R.mipmap.movie_shot, R.mipmap.movie_shot, R.mipmap.movie_shot};

            BoxOffice tmpBoxOffice = new BoxOffice(2, 8663, 93546);

            List<MovieComment> commentList = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                MovieComment movieComment = new MovieComment(R.mipmap.ic_launcher,
                        "吃过群众" + i, "饰 饰 杰克船长333333aaaaaaaaaaa啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊凄凄切切群群群群群群群群群群群群群", "05-06");
                commentList.add(movieComment);
            }

            //Filling Movies
            Movie A = new Movie();
            A.mid = 1;
            A.name = "加勒比海盗5：死无对证";
            A.nameEng = "Pirates of the Caribbean";
            A.onair = true;
            A.movieIntro = "亡灵要复仇，船长要发愁";
            A.audience_rating = 9.0f;
            A.audience_num = 36002;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            A.imageid = R.mipmap.poster1;
            A.nWantSee = 0;
            A.premiereDate = ft.parse("2017-05-03");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            Movie B = new Movie();
            B.mid = 2;
            B.name = "荡寇风云";
            A.nameEng = "Pirates of the Caribbean";
            B.onair = false;
            B.movieIntro = "战神戚继光，海战谁更强";
            B.audience_rating = -1f;
            A.audience_num = -1;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            B.imageid = R.mipmap.poster2;
            B.nWantSee = 5246;
            B.premiereDate = ft.parse("2017-09-09");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            Movie C = new Movie();
            C.mid = 3;
            C.name = "摔跤吧！爸爸";
            A.nameEng = "Pirates of the Caribbean";
            C.onair = true;
            C.movieIntro = "为圆摔跤梦，女儿不心疼";
            C.audience_rating = 9.8f;
            A.audience_num = 36002;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            C.imageid = R.mipmap.poster3;
            C.nWantSee = 123432;
            C.premiereDate = ft.parse("2017-05-03");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            Movie D = new Movie();
            D.mid = 4;
            D.name = "\"吃吃\"的爱";
            A.nameEng = "Pirates of the Caribbean";
            D.onair = true;
            D.movieIntro = "康永脑洞开，群星浪起来";
            D.audience_rating = -1f;
            A.audience_num = -1;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            D.imageid = R.mipmap.poster4;
            D.nWantSee = 2341;
            D.premiereDate = ft.parse("2017-05-03");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            Movie E = new Movie();
            E.mid = 5;
            E.name = "神奇女侠";
            A.nameEng = "Pirates of the Caribbean";
            E.onair = false;
            E.movieIntro = "神力女超人，救世又圈粉";
            E.audience_rating = -1f;
            A.audience_num = -1;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            E.imageid = R.mipmap.poster5;
            E.nWantSee = 91835;
            E.premiereDate = ft.parse("2017-09-09");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            Movie F = new Movie();
            F.mid = 6;
            F.name = "银河护卫队2";
            A.nameEng = "Pirates of the Caribbean";
            F.onair = true;
            F.movieIntro = "星爵身世谜，终于见爹地";
            F.audience_rating = 9.1f;
            A.audience_num = 36002;
            A.movieType = "喜剧 动作 奇幻";
            A.movieSourceDest = "美国";
            A.movieLength = 129;
            F.imageid = R.mipmap.poster6;
            F.nWantSee = 229858;
            F.premiereDate = ft.parse("2010-05-03");
            A.staffList = staffList;
            A.movieshotIdList = movieshotIdList;
            A.boxOffice = tmpBoxOffice;
            A.commentList = commentList;

            movie_list.add(A);
            movie_list.add(B);
            movie_list.add(C);
            movie_list.add(D);
            movie_list.add(E);
            movie_list.add(F);

        }
        catch (ParseException e) {
            Log.d("MovieCache", "Parse Error");
        }


    }

    public Movie getMovie(int mid) {
        return movie_list.get(mid - 1);
    }

    public List<Movie> getMovieList() {
        return movie_list;
    }
}
