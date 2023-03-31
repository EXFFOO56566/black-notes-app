.class public Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;


# instance fields
.field private A:Lnotepad/note/notas/notes/notizen/util/a;

.field private B:Lnotepad/note/notas/notes/notizen/checklist/b;

.field private C:Lc/a/a/a/a/b/b/b;

.field private D:Landroidx/recyclerview/widget/f;

.field private E:Lcom/google/android/gms/ads/i;

.field private F:Landroid/widget/ImageView;

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private H:Z

.field private I:Landroid/widget/RemoteViews;

.field private s:Lc/a/a/a/a/b/b/d;

.field private t:Lc/a/a/a/a/b/b/a;

.field private u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private w:I

.field private x:Lc/a/a/a/a/b/c/d;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->H:Z

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->F:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->o()V

    return-void
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 11

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->G:Ljava/util/ArrayList;

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0b005c

    invoke-direct {v0, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    new-instance v0, Lc/a/a/a/a/b/b/b;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->t:Lc/a/a/a/a/b/b/a;

    const v0, 0x7f080198

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f08018a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800e7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->y:Landroid/widget/ImageView;

    const v0, 0x7f0800d5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->z:Landroid/widget/ImageView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/checklist/b;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-direct {v0, p0, v2}, Lnotepad/note/notas/notes/notizen/checklist/b;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance v2, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-direct {v2, v3}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V

    new-instance v3, Landroidx/recyclerview/widget/f;

    invoke-direct {v3, v2}, Landroidx/recyclerview/widget/f;-><init>(Landroidx/recyclerview/widget/f$f;)V

    iput-object v3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->D:Landroidx/recyclerview/widget/f;

    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    const v0, 0x7f0800d3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->F:Landroid/widget/ImageView;

    const v0, 0x7f080042

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/google/android/gms/ads/i;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->E:Lcom/google/android/gms/ads/i;

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

    new-instance v4, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity$a;

    invoke-direct {v4, p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;)V

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

    const/4 v2, 0x5

    if-lt v0, v2, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v2, Lcom/google/android/gms/ads/d$a;

    invoke-direct {v2}, Lcom/google/android/gms/ads/d$a;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/d$a;->a()Lcom/google/android/gms/ads/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/d;)V

    :cond_3
    :goto_1
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

    :goto_2
    :try_start_0
    array-length v4, v0

    if-ge v3, v4, :cond_5

    aget v4, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    iget v5, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    if-ne v4, v5, :cond_4

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->G:Ljava/util/ArrayList;

    aget v5, v0, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x1

    iput-boolean v4, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->H:Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catch_0
    :cond_5
    return-void
.end method

.method private q()V
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

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->E:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->o()V

    :goto_0
    return-void
.end method

.method private r()V
    .locals 6

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/checklist/b;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, ""

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "\n"

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/b;->c()Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u25cb "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/b;->c()Z

    move-result v5

    if-eqz v5, :cond_2

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x1

    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u25cf "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "Send to"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->E:Lcom/google/android/gms/ads/i;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method private t()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->t:Lc/a/a/a/a/b/b/a;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0027

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->y:Landroid/widget/ImageView;

    const v1, 0x7f07008a

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->z:Landroid/widget/ImageView;

    const v1, 0x7f070087

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_4
    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/checklist/b;->a(Lnotepad/note/notas/notes/notizen/checklist/b$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->D:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 8

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "noteId"

    const v3, 0x7f01000d

    const/4 v4, 0x0

    const v5, 0x7f080067

    if-ne v0, v5, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    invoke-virtual {p0, v3, v4}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v5, 0x7f080065

    if-ne v0, v5, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/DeleteNoteActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "type"

    const-string v1, "note"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, 0x2

    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v5, 0x7f080060

    if-ne v0, v5, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->q()V

    goto/16 :goto_4

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v5, 0x7f08005a

    const v6, 0x7f01000f

    if-ne v0, v5, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

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

    invoke-virtual {p0, p1, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_4

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v5, 0x7f080072

    const v7, 0x7f010011

    if-ne v0, v5, :cond_a

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_2
    invoke-virtual {p0, v7, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_4

    :cond_9
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/password/RemovePasswordActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x5

    goto/16 :goto_1

    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v5, 0x7f080058

    if-ne v0, v5, :cond_c

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->k()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1, v4}, Lc/a/a/a/a/b/c/d;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, v0, v4}, Lc/a/a/a/a/b/b/d;->a(IZ)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->z:Landroid/widget/ImageView;

    const v0, 0x7f070086

    goto :goto_3

    :cond_b
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1, v1}, Lc/a/a/a/a/b/c/d;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/a/b/b/d;->a(IZ)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->z:Landroid/widget/ImageView;

    const v0, 0x7f070087

    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080054

    if-ne v0, v1, :cond_e

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_d

    return-void

    :cond_d
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x6

    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08006f

    if-ne v0, v1, :cond_10

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_f

    return-void

    :cond_f
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_2

    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007f

    if-ne v0, v1, :cond_12

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_11

    return-void

    :cond_11
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->r()V

    goto :goto_4

    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08007d

    if-ne p1, v0, :cond_14

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_13

    return-void

    :cond_13
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v0, 0x9

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v3, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_14
    :goto_4
    return-void
.end method

.method public synthetic c(I)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/EditCheckboxActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "checkboxId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/16 p1, 0x8

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

    if-ne p2, v0, :cond_9

    const/4 p2, 0x1

    const v0, 0x7f0801a3

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->g(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->t()V

    iget-boolean p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->H:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->G:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    invoke-virtual {p3, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    const-string v1, "delete"

    const-string v2, "type"

    if-ne p1, p2, :cond_2

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->b(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/b;->d(I)V

    iget-boolean p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->H:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    const-string p2, "Deleted note"

    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    const p2, 0x7f080120

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->G:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    invoke-virtual {p3, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->o()V

    goto/16 :goto_5

    :cond_2
    const/4 p2, 0x3

    if-ne p1, p2, :cond_3

    const/4 p1, 0x0

    const-string p2, "categoryId"

    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p2, v0, p1}, Lc/a/a/a/a/b/b/d;->a(II)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string p2, "categoryName"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :cond_3
    const/4 p2, 0x4

    if-ne p1, p2, :cond_4

    const-string p1, "password"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p2, p1}, Lc/a/a/a/a/b/c/d;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->y:Landroid/widget/ImageView;

    const p2, 0x7f07008a

    :goto_2
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_5

    :cond_4
    const/4 p2, 0x5

    if-ne p1, p2, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    const-string p3, ""

    invoke-virtual {p1, p2, p3}, Lc/a/a/a/a/b/b/d;->a(ILjava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1, p3}, Lc/a/a/a/a/b/c/d;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->y:Landroid/widget/ImageView;

    const p2, 0x7f070089

    goto :goto_2

    :cond_5
    const/4 p2, 0x6

    if-ne p1, p2, :cond_6

    :goto_3
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/d;->g(I)V

    :goto_4
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    iget p3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p2, p3}, Lc/a/a/a/a/b/b/b;->f(I)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/b;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->B:Lnotepad/note/notas/notes/notizen/checklist/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    goto :goto_5

    :cond_6
    const/16 p2, 0x8

    if-ne p1, p2, :cond_7

    goto :goto_3

    :cond_7
    const/16 p2, 0x9

    if-ne p1, p2, :cond_9

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/b;->b(I)V

    goto :goto_4

    :cond_8
    const-string p2, "unCheck"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    iget p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/b;->g(I)V

    goto :goto_4

    :cond_9
    :goto_5
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->q()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0022

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->t()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->u()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->s()V

    return-void
.end method

.method protected onPause()V
    .locals 5

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->H:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    const v1, 0x7f0801a3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->x:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v3}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->C:Lc/a/a/a/a/b/b/b;

    iget v4, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->w:I

    invoke-virtual {v3, v4}, Lc/a/a/a/a/b/b/b;->a(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v2

    iget-object v3, p0, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;->I:Landroid/widget/RemoteViews;

    invoke-virtual {v2, v1, v3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/d;->onPause()V

    return-void
.end method
