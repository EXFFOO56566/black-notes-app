.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Lnotepad/note/notas/notes/notizen/util/a;

.field private C:Ljava/lang/String;

.field private D:Landroid/content/SharedPreferences$Editor;

.field private E:Lcom/google/android/gms/ads/i;

.field private F:Landroid/widget/RemoteViews;

.field private G:Landroid/widget/ImageView;

.field private H:Landroid/view/GestureDetector;

.field private s:Lc/a/a/a/a/b/c/d;

.field private t:I

.field private u:I

.field private v:Lc/a/a/a/a/b/b/a;

.field private w:Lc/a/a/a/a/b/b/d;

.field private x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private z:Lnotepad/note/notas/notes/notizen/ui/MyTextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const-string v0, "purpleLight"

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->C:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->G:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    return-object p0
.end method

.method private c(I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    const-string v2, "widgetId"

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
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#E6E6E6"

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#BFBFBF"

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

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

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->d(I)V

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
    .locals 11

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "widgetId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    const-string v0, "widgetColor"

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->D:Landroid/content/SharedPreferences$Editor;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "purpleLight"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->C:Ljava/lang/String;

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->v:Lc/a/a/a/a/b/b/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->w:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f080198

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f08018d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f08018a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800df

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->A:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0b005c

    invoke-direct {v0, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    const v0, 0x7f080042

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v2, 0x7f0800d3

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->G:Landroid/widget/ImageView;

    new-instance v2, Lcom/google/android/gms/ads/i;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->E:Lcom/google/android/gms/ads/i;

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

    new-instance v4, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$a;

    invoke-direct {v4, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V

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

    const/4 v1, 0x5

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v1, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v1}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/d;)V

    :cond_3
    :goto_1
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

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method private s()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

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

.method private t()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->A:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->C:Ljava/lang/String;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    return-void
.end method

.method private v()V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->w:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

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

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    const v2, 0x7f0801a3

    const-string v3, "Deleted note"

    invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    const v2, 0x7f080120

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    iget v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {v0, v2, v3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x8

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "NOTE_TEXT_COLOR"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->d(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->v:Lc/a/a/a/a/b/b/a;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0027

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u()V

    return-void
.end method

.method private w()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->x()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t()V

    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/c;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/c;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V

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
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x42280000    # 42.0f

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x42040000    # 33.0f

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41e00000    # 28.0f

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41c00000    # 24.0f

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const/high16 v2, 0x41a00000    # 20.0f

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

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

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->H:Landroid/view/GestureDetector;

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

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->H:Landroid/view/GestureDetector;

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

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->c(I)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080065

    const v3, 0x7f01000d

    if-ne v0, v2, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

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

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    const-string v2, "widgetId"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v3, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080060

    if-ne v0, v2, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->r()V

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f08005a

    const v4, 0x7f01000f

    if-ne v0, v2, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

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

    invoke-virtual {p0, p1, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_1

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f080073

    if-ne v0, v2, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

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

    const v2, 0x7f08005c

    if-ne v0, v2, :cond_b

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_a

    return-void

    :cond_a
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x5

    goto :goto_0

    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08005e

    if-ne v0, v1, :cond_c

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y()V

    goto :goto_1

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007c

    if-ne v0, v1, :cond_e

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->B:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_d

    return-void

    :cond_d
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v3, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_1

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08005d

    if-ne p1, v0, :cond_f

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->o()V

    :cond_f
    :goto_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_8

    const/4 p2, 0x1

    const-string v0, ""

    const v1, 0x7f0801a3

    if-ne p1, p2, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->v()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :goto_1
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {p1, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto/16 :goto_2

    :cond_1
    const/4 p2, 0x2

    const v2, 0x7f080120

    const-string v3, "type"

    if-ne p1, p2, :cond_2

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "delete"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->w:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->b(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    const-string p2, "Deleted note"

    invoke-virtual {p1, v1, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    const/4 p2, 0x0

    invoke-virtual {p1, v2, p2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {p1, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_2

    :cond_2
    const/4 p2, 0x3

    const/4 v1, 0x0

    if-ne p1, p2, :cond_3

    const-string p1, "categoryId"

    invoke-virtual {p3, p1, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->w:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    invoke-virtual {p2, v0, p1}, Lc/a/a/a/a/b/b/d;->a(II)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string p2, "categoryName"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_3
    const/4 p2, 0x4

    if-ne p1, p2, :cond_5

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "information"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->t:I

    const-string p3, "noteId"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f01000d

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_2

    :cond_4
    const-string p2, "send"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s()V

    goto :goto_2

    :cond_5
    const/4 p2, 0x5

    if-ne p1, p2, :cond_6

    const-string p1, "color"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->C:Ljava/lang/String;

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u()V

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->D:Landroid/content/SharedPreferences$Editor;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->u:I

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->D:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->F:Landroid/widget/RemoteViews;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    const-string p3, "setBackgroundColor"

    invoke-virtual {p2, v2, p3, p1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto/16 :goto_1

    :cond_6
    const/4 p2, 0x6

    if-ne p1, p2, :cond_8

    const-string p1, "noteSearch"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p3}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p0, p2, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V

    :cond_8
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->r()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0040

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->v()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->w()V

    return-void
.end method
