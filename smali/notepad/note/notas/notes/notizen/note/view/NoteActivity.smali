.class public Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/ImageView;

.field private C:Landroid/widget/ImageView;

.field private D:Landroid/view/GestureDetector;

.field private E:Lcom/google/android/gms/ads/i;

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private G:Z

.field private H:Landroid/widget/RemoteViews;

.field private s:I

.field private t:Lc/a/a/a/a/b/b/a;

.field private u:Lc/a/a/a/a/b/b/d;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private y:Lnotepad/note/notas/notes/notizen/util/a;

.field private z:Lc/a/a/a/a/b/c/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->G:Z

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->C:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->q()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    return-object p0
.end method

.method private c(I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "selectedPosition"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const p1, 0x7f010011

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    :goto_0
    return-void
.end method

.method private d(I)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#E6E6E6"

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#BFBFBF"

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#899298"

    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    return-void
.end method

.method private o()V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "NOTE_TEXT_COLOR"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v4, 0x2

    if-ge v1, v4, :cond_0

    add-int/lit8 v0, v1, 0x1

    :cond_0
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->d(I)V

    return-void
.end method

.method private p()V
    .locals 1

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x2

    :goto_0
    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;I)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private q()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private r()V
    .locals 11

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->F:Ljava/util/ArrayList;

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0b005c

    invoke-direct {v0, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->t:Lc/a/a/a/a/b/b/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f080198

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800d3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->C:Landroid/widget/ImageView;

    const v0, 0x7f08018d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f08018a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800e7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->A:Landroid/widget/ImageView;

    const v0, 0x7f0800d5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->B:Landroid/widget/ImageView;

    const v0, 0x7f080042

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/google/android/gms/ads/i;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->E:Lcom/google/android/gms/ads/i;

    const v3, 0x7f0e005c

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/i;->a(Ljava/lang/String;)V

    const-string v2, "SETTING"

    invoke-virtual {p0, v2, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const v3, 0x7f08003e

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/ads/AdView;

    new-instance v4, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$a;

    invoke-direct {v4, p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/b;)V

    const-string v4, "isPremium"

    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    sub-long/2addr v5, v7

    const-string v7, "endFreeAdsTime"

    invoke-interface {v2, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v9, 0x8

    cmp-long v10, v5, v7

    if-ltz v10, :cond_1

    :goto_0
    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/d;)V

    const-string v0, "interstitialAds"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v3, 0x5

    if-lt v0, v3, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v3, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v3}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/d;)V

    :cond_3
    :goto_1
    const-string v0, "rateAppComplete"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_5

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v5, "rateApp"

    invoke-interface {v2, v5, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    const/4 v7, 0x6

    if-ne v6, v7, :cond_4

    invoke-interface {v3, v0, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lnotepad/note/notas/notes/notizen/util/RateAppActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const v0, 0x7f01000d

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_2

    :cond_4
    invoke-interface {v2, v5, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v0, v4

    invoke-interface {v3, v5, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_5
    :goto_2
    new-instance v0, Landroid/content/ComponentName;

    const-class v2, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetOneByOne;

    invoke-direct {v0, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v0

    const-string v2, "widgetNoteId"

    invoke-virtual {p0, v2, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    :try_start_0
    array-length v5, v0

    if-ge v3, v5, :cond_7

    aget v5, v0, v3

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    iget v6, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    if-ne v5, v6, :cond_6

    iget-object v5, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->F:Ljava/util/ArrayList;

    aget v6, v0, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v4, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->G:Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :catch_0
    :cond_7
    return-void
.end method

.method private s()V
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

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->q()V

    :goto_0
    return-void
.end method

.method private t()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "Send to"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method private v()V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x8

    const-string v3, ""

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "NOTE_TEXT_COLOR"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->d(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->t:Lc/a/a/a/a/b/b/a;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0027

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->A:Landroid/widget/ImageView;

    const v1, 0x7f07008a

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_6
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->B:Landroid/widget/ImageView;

    const v1, 0x7f070087

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "search"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p0, v1, v0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p0, v1, v0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V

    :cond_8
    return-void
.end method

.method private w()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->x()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u()V

    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/view/a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/view/a;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private y()V
    .locals 3

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x42280000    # 42.0f

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x42040000    # 33.0f

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41e00000    # 28.0f

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41c00000    # 24.0f

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41a00000    # 20.0f

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41880000    # 17.0f

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/z;->setTextSize(IF)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private z()V
    .locals 2

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->D:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    new-instance v3, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const-string v4, "#8030be91"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_1

    const/4 v5, -0x1

    if-eq v1, v5, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v1

    const/16 v6, 0x21

    invoke-interface {v3, v2, v1, v5, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    add-int/lit8 v2, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public synthetic a(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->D:Landroid/view/GestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7f080067

    if-ne v0, v2, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v1}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->c(I)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080065

    const v3, 0x7f01000d

    if-ne v0, v2, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/DeleteNoteActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "type"

    const-string v2, "note"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v3, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080060

    if-ne v0, v2, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s()V

    goto/16 :goto_3

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f08005a

    const v4, 0x7f01000f

    if-ne v0, v2, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000c

    :goto_1
    invoke-virtual {p0, p1, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080073

    if-ne v0, v2, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/SelectNoteMoreActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x4

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080072

    if-ne v0, v2, :cond_c

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_a

    return-void

    :cond_a
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    const-string v1, "noteId"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f010011

    goto :goto_1

    :cond_b
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/password/RemovePasswordActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x6

    goto/16 :goto_0

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080058

    if-ne v0, v2, :cond_e

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->k()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1, v1}, Lc/a/a/a/a/b/c/d;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/a/b/b/d;->a(IZ)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->B:Landroid/widget/ImageView;

    const v0, 0x7f070086

    goto :goto_2

    :cond_d
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc/a/a/a/a/b/c/d;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {p1, v1, v0}, Lc/a/a/a/a/b/b/d;->a(IZ)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->B:Landroid/widget/ImageView;

    const v0, 0x7f070087

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08005e

    if-ne v0, v1, :cond_f

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->y()V

    goto :goto_3

    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007c

    if-ne v0, v1, :cond_10

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x7

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v3, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_3

    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08005d

    if-ne p1, v0, :cond_11

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->o()V

    :cond_11
    :goto_3
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_a

    const/4 p2, 0x1

    const v0, 0x7f0801a3

    const-string v1, ""

    if-ne p1, p2, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v()V

    iget-boolean p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->G:Z

    if-eqz p1, :cond_a

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->F:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    invoke-virtual {p3, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    const-string v2, "type"

    if-ne p1, p2, :cond_3

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "delete"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->b(I)V

    iget-boolean p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->G:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    const-string p2, "Deleted note"

    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    const p2, 0x7f080120

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->F:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->H:Landroid/widget/RemoteViews;

    invoke-virtual {p3, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->q()V

    goto/16 :goto_4

    :cond_3
    const/4 p2, 0x3

    const/4 v0, 0x0

    if-ne p1, p2, :cond_4

    const-string p1, "categoryId"

    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {p2, v0, p1}, Lc/a/a/a/a/b/b/d;->a(II)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string p2, "categoryName"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_4
    const/4 p2, 0x4

    if-ne p1, p2, :cond_6

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "information"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    const-string p3, "noteId"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f01000d

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_4

    :cond_5
    const-string p2, "send"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->t()V

    goto :goto_4

    :cond_6
    const/4 p2, 0x5

    if-ne p1, p2, :cond_7

    const-string p1, "password"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2, p1}, Lc/a/a/a/a/b/c/d;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->A:Landroid/widget/ImageView;

    const p2, 0x7f07008a

    :goto_3
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    :cond_7
    const/4 p2, 0x6

    if-ne p1, p2, :cond_8

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->u:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s:I

    invoke-virtual {p1, p2, v1}, Lc/a/a/a/a/b/b/d;->a(ILjava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1, v1}, Lc/a/a/a/a/b/c/d;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->A:Landroid/widget/ImageView;

    const p2, 0x7f070089

    goto :goto_3

    :cond_8
    const/4 p2, 0x7

    if-ne p1, p2, :cond_a

    const-string p1, "noteSearch"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p3}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p0, p2, p1}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V

    :cond_a
    :goto_4
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->s()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->r()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->v()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->w()V

    return-void
.end method
