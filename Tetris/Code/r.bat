copy /y nul scoreHolder.txt
git init
git reset --hard HEAD
git config --global user.email aaronstrong100@gmail.com
git pull --allow-unrelated-histories https://github.com/aaronstrong100/Tetris-Scores master
javaw starter
git pull --allow-unrelated-histories https://github.com/aaronstrong100/Tetris-Scores master
javaw fileManager
git add leaderboard.txt
git commit leaderboard.txt -m "update"
git push https://aaronstrong100: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@github.com/aaronstrong100/Tetris-Scores.git  master