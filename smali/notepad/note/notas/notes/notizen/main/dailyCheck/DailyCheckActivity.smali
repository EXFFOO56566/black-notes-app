.class public Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;
    }
.end annotation


# instance fields
.field private A:Lnotepad/note/notas/notes/notizen/util/a;

.field private s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private v:Lc/a/a/a/a/b/b/c;

.field private w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

.field private x:Landroidx/recyclerview/widget/f;

.field private y:Lcom/google/android/gms/ads/i;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->z:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->p()V

    return-void
.end method

.method private o()V
    .locals 6

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/AddDailyCheckboxActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    sget-object v2, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "isTodo"

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    invoke-virtual {p0, v0, v3}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const v0, 0x7f01000d

    invoke-virtual {p0, v0, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010012

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private q()V
    .locals 11

    const-string v0, "#1C1C1C"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f080199

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f080196

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance v0, Lc/a/a/a/a/b/b/c;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance v1, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-direct {v1, v2}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V

    new-instance v2, Landroidx/recyclerview/widget/f;

    invoke-direct {v2, v1}, Landroidx/recyclerview/widget/f;-><init>(Landroidx/recyclerview/widget/f$f;)V

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->x:Landroidx/recyclerview/widget/f;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "To-Do("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    invoke-virtual {v1, v3}, Lc/a/a/a/a/b/b/c;->a(Z)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Shopping("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lc/a/a/a/a/b/b/c;->a(Z)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f080042

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f0800d3

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->z:Landroid/widget/ImageView;

    new-instance v1, Lcom/google/android/gms/ads/i;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->y:Lcom/google/android/gms/ads/i;

    const v2, 0x7f0e005c

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/i;->a(Ljava/lang/String;)V

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v4}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const v2, 0x7f08003e

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    new-instance v3, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$a;

    invoke-direct {v3, p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/b;)V

    const-string v3, "isPremium"

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    sub-long/2addr v5, v7

    const-string v7, "endFreeAdsTime"

    invoke-interface {v1, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v9, 0x8

    cmp-long v10, v5, v7

    if-ltz v10, :cond_0

    :goto_0
    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/d;)V

    const-string v0, "interstitialAds"

    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x5

    if-lt v0, v2, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->y:Lcom/google/android/gms/ads/i;

    new-instance v2, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v2}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/d;)V

    :cond_2
    :goto_1
    const-string v0, "todo"

    const-string v2, "dailyCheckTab"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->x()V

    goto :goto_2

    :cond_3
    const-string v0, "shopping"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w()V

    :cond_4
    :goto_2
    return-void
.end method

.method private r()V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "interstitialAds"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v4, 0x5

    if-lt v1, v4, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->y:Lcom/google/android/gms/ads/i;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->y:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->p()V

    :goto_0
    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->y:Lcom/google/android/gms/ads/i;

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$c;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$c;-><init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method private t()V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    sget-object v1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    const-string v2, ")"

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "To-Do("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lc/a/a/a/a/b/b/c;->a(Z)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Shopping("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lc/a/a/a/a/b/b/c;->a(Z)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;)V

    return-void
.end method

.method private v()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s()V

    return-void
.end method

.method private w()V
    .locals 3

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->c:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v1, "#899298"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v1, "#FFFFFF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "dailyCheckTab"

    const-string v2, "shopping"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private x()V
    .locals 3

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v1, "#FFFFFF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v1, "#899298"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    const-string v0, "SETTING"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "dailyCheckTab"

    const-string v2, "todo"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->x:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->x()V

    goto :goto_0

    :sswitch_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w()V

    goto :goto_0

    :sswitch_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f010011

    const v0, 0x7f01000f

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    :sswitch_3
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->r()V

    goto :goto_0

    :sswitch_4
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->o()V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f080054 -> :sswitch_4
        0x7f080060 -> :sswitch_3
        0x7f08006f -> :sswitch_2
        0x7f080080 -> :sswitch_1
        0x7f080083 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-ne p1, p3, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    invoke-virtual {p2, p3}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    invoke-virtual {p3, p2}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->t()V

    goto :goto_2

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->s:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;->b:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$d;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    invoke-virtual {p2, p3}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v:Lc/a/a/a/a/b/b/c;

    invoke-virtual {p3, p2}, Lc/a/a/a/a/b/b/c;->b(Z)Ljava/util/ArrayList;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :cond_3
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->r()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0024

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->v()V

    return-void
.end method
