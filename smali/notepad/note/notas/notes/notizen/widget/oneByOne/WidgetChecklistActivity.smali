.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;


# instance fields
.field private A:Lnotepad/note/notas/notes/notizen/checklist/b;

.field private B:Lc/a/a/a/a/b/b/b;

.field private C:Landroidx/recyclerview/widget/f;

.field private D:Ljava/lang/String;

.field private E:Landroid/content/SharedPreferences$Editor;

.field private F:Landroid/widget/RemoteViews;

.field private G:Lc/a/a/a/a/b/c/d;

.field private H:Z

.field private I:Landroid/widget/ImageView;

.field private J:Lcom/google/android/gms/ads/i;

.field private s:I

.field private t:I

.field private u:Lc/a/a/a/a/b/b/d;

.field private v:Lc/a/a/a/a/b/b/a;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private y:Landroid/widget/LinearLayout;

.field private z:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const-string v0, "purpleLight"

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->D:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->H:Z

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->I:Landroid/widget/ImageView;

    return-object p0
.end method

.method private o()V
    .locals 11

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "widgetId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

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

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->E:Landroid/content/SharedPreferences$Editor;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "purpleLight"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->D:Ljava/lang/String;

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    new-instance v0, Lc/a/a/a/a/b/b/b;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->B:Lc/a/a/a/a/b/b/b;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->z:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->v:Lc/a/a/a/a/b/b/a;

    const v0, 0x7f080198

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f08018a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800df

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->y:Landroid/widget/LinearLayout;

    new-instance v0, Lnotepad/note/notas/notes/notizen/checklist/b;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-direct {v0, p0, v2}, Lnotepad/note/notas/notes/notizen/checklist/b;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    const v2, 0x7f0800d3

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->I:Landroid/widget/ImageView;

    const v2, 0x7f080042

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    new-instance v3, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f0b005c

    invoke-direct {v3, v4, v5}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    new-instance v3, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-direct {v3, v4}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V

    new-instance v4, Landroidx/recyclerview/widget/f;

    invoke-direct {v4, v3}, Landroidx/recyclerview/widget/f;-><init>(Landroidx/recyclerview/widget/f$f;)V

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->C:Landroidx/recyclerview/widget/f;

    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    new-instance v0, Lcom/google/android/gms/ads/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->J:Lcom/google/android/gms/ads/i;

    const v3, 0x7f0e005c

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/i;->a(Ljava/lang/String;)V

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const v3, 0x7f08003e

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/ads/AdView;

    new-instance v4, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity$a;

    invoke-direct {v4, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/b;)V

    const-string v4, "isPremium"

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    sub-long/2addr v5, v7

    const-string v7, "endFreeAdsTime"

    invoke-interface {v0, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v9, 0x8

    cmp-long v10, v5, v7

    if-ltz v10, :cond_1

    :goto_0
    invoke-virtual {v2, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v2}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/d;)V

    const-string v2, "interstitialAds"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->J:Lcom/google/android/gms/ads/i;

    new-instance v1, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v1}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/d;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private p()V
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

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->J:Lcom/google/android/gms/ads/i;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->J:Lcom/google/android/gms/ads/i;

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

.method private q()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->J:Lcom/google/android/gms/ads/i;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->y:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->D:Ljava/lang/String;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    return-void
.end method

.method private s()V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

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

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    const v2, 0x7f0801a3

    const-string v3, "Deleted note"

    invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    const v2, 0x7f080120

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    iget v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {v0, v2, v3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->v:Lc/a/a/a/a/b/b/a;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0027

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->r()V

    return-void
.end method

.method private t()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/checklist/b;->a(Lnotepad/note/notas/notes/notizen/checklist/b$a;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->q()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->C:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->z:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080067

    const-string v2, "noteId"

    const-string v3, "widgetId"

    const/4 v4, 0x0

    const v5, 0x7f01000d

    if-ne v0, v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v5, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080065

    if-ne v0, v1, :cond_2

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/DeleteNoteActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "type"

    const-string v1, "note"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080060

    if-ne v0, v1, :cond_3

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->p()V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08005a

    if-ne v0, v1, :cond_4

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000c

    const v0, 0x7f01000f

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080054

    if-ne v0, v1, :cond_5

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x4

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08005c

    if-ne p1, v0, :cond_6

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x5

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method public synthetic c(I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/EditCheckboxActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    const-string v2, "widgetId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "checkboxId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p1, 0x6

    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000d

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_5

    const p2, 0x7f0801a3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, p3}, Lc/a/a/a/a/b/b/d;->g(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p3}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :goto_0
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {p1, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto/16 :goto_2

    :cond_0
    const/4 v1, 0x2

    const v2, 0x7f080120

    if-ne p1, v1, :cond_1

    const-string p1, "type"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "delete"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->H:Z

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, p3}, Lc/a/a/a/a/b/b/d;->b(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->B:Lc/a/a/a/a/b/b/b;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, p3}, Lc/a/a/a/a/b/b/b;->d(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    const-string p3, "Deleted note"

    invoke-virtual {p1, p2, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    const/4 p2, 0x0

    invoke-virtual {p1, v2, p2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {p1, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    :cond_1
    const/4 p2, 0x3

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const-string p2, "categoryId"

    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p2, v0, p1}, Lc/a/a/a/a/b/b/d;->a(II)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string p2, "categoryName"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    const/4 p2, 0x4

    if-ne p1, p2, :cond_3

    :goto_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->u:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->g(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->B:Lc/a/a/a/a/b/b/b;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {p2, p3}, Lc/a/a/a/a/b/b/b;->f(I)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/b;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    goto :goto_2

    :cond_3
    const/4 p2, 0x5

    if-ne p1, p2, :cond_4

    const-string p1, "color"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->D:Ljava/lang/String;

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->r()V

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->E:Landroid/content/SharedPreferences$Editor;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->E:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    const-string p3, "setBackgroundColor"

    invoke-virtual {p2, v2, p3, p1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto/16 :goto_0

    :cond_4
    const/4 p2, 0x6

    if-ne p1, p2, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->p()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b003f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->o()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t()V

    return-void
.end method

.method protected onPause()V
    .locals 5

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->H:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    const v1, 0x7f0801a3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->G:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->B:Lc/a/a/a/a/b/b/b;

    iget v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->s:I

    invoke-virtual {v3, v4}, Lc/a/a/a/a/b/b/b;->a(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    iget v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->t:I

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;->F:Landroid/widget/RemoteViews;

    invoke-virtual {v0, v1, v2}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/d;->onPause()V

    return-void
.end method
