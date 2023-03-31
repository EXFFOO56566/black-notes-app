.class public Lnotepad/note/notas/notes/notizen/main/MainActivity;
.super Landroidx/appcompat/app/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/main/MainActivity$c;
    }
.end annotation


# static fields
.field public static G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

.field public static H:I

.field public static I:Z

.field public static J:Z

.field public static K:Z


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/ImageView;

.field C:Lb/a/a/a/a;

.field D:Landroid/content/ServiceConnection;

.field private E:Landroid/os/Bundle;

.field F:I

.field private s:Lnotepad/note/notas/notes/notizen/main/b;

.field private t:Lc/a/a/a/a/b/b/a;

.field private u:Lc/a/a/a/a/b/b/d;

.field private v:Lnotepad/note/notas/notes/notizen/util/a;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Z

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    sput-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const/4 v0, 0x0

    sput v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    const/4 v1, 0x1

    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->y:Z

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;

    invoke-direct {v0, p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->D:Landroid/content/ServiceConnection;

    const/4 v0, -0x1

    iput v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->F:I

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->p()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/MainActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    const/4 v0, 0x1

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->y:Z

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lnotepad/note/notas/notes/notizen/main/b;->e(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->y:Z

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {p1, v0}, Lnotepad/note/notas/notes/notizen/main/b;->e(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->q()V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/main/MainActivity;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method

.method private p()V
    .locals 5

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->C:Lb/a/a/a/a;

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "inapp"

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lb/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->E:Landroid/os/Bundle;

    const-string v1, "RESPONSE_CODE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->F:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_0
    iget v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->F:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->E:Landroid/os/Bundle;

    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "productId"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "remove_ads"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "purchaseState"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v3, "isPremium"

    if-nez v2, :cond_0

    const/4 v1, 0x1

    :try_start_2
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_0
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :goto_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_1
    :goto_2
    return-void
.end method

.method private q()V
    .locals 4

    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s()V

    return-void

    :cond_0
    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0024

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    sget-object v2, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/d;->a(Lnotepad/note/notas/notes/notizen/main/MainActivity$c;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/b;->a(Ljava/util/ArrayList;)V

    goto :goto_2

    :cond_1
    sget v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    if-nez v0, :cond_2

    const/4 v0, 0x1

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0094

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->t:Lc/a/a/a/a/b/b/a;

    invoke-virtual {v2, v0}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    sget v2, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    sget-object v3, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    invoke-virtual {v1, v2, v3}, Lc/a/a/a/a/b/b/d;->a(ILnotepad/note/notas/notes/notizen/main/MainActivity$c;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v()V

    return-void
.end method

.method private r()V
    .locals 11

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    const-string v0, "#1C1C1C"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "initSetting"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-nez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-wide/32 v9, 0x3dcc500

    add-long/2addr v7, v9

    const-string v4, "endFreeAdsTime"

    invoke-interface {v2, v4, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {p0, v6}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;I)V

    :cond_0
    const-string v2, "EDITED_TIME"

    const-string v3, "sort"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v7, 0x34775e4

    if-eq v4, v7, :cond_3

    const v7, 0x4c22a38

    if-eq v4, v7, :cond_2

    const v0, 0x1e062123

    if-eq v4, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const-string v2, "TITLE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_3
    const-string v0, "CREATED_TIME"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v6, :cond_5

    goto :goto_3

    :cond_5
    sget-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->d:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    goto :goto_2

    :cond_6
    sget-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    goto :goto_2

    :cond_7
    sget-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->b:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    :goto_2
    sput-object v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    :goto_3
    invoke-static {p0}, Lcom/google/android/gms/ads/k;->a(Landroid/content/Context;)V

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->t:Lc/a/a/a/a/b/b/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f08004b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->z:Landroid/widget/LinearLayout;

    const v0, 0x7f08018b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f0800fa

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->x:Landroid/widget/RelativeLayout;

    const v0, 0x7f0800e5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->A:Landroid/widget/ImageView;

    const v0, 0x7f0800e4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->B:Landroid/widget/ImageView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/b;

    invoke-direct {v0, p0}, Lnotepad/note/notas/notes/notizen/main/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v6, :cond_8

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    goto :goto_4

    :cond_8
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v1, p0, v6}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    :goto_4
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->D:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0, v1, v5}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method private s()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x0

    sput v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f0e004b

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->A:Landroid/widget/ImageView;

    const v2, 0x7f07007f

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v1, 0x1

    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/b/d;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/b;->a(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    return-void
.end method

.method private t()V
    .locals 2

    const/4 v0, 0x0

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->A:Landroid/widget/ImageView;

    const v1, 0x7f070076

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w()V

    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/b;->a(Lnotepad/note/notas/notes/notizen/main/b$c;)V

    return-void
.end method

.method private v()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/main/b;->a()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->y:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->B:Landroid/widget/ImageView;

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private w()V
    .locals 3

    const/4 v0, 0x1

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    const/4 v0, 0x0

    sput-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->K:Z

    sput v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0e0024

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    sget-object v2, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/d;->a(Lnotepad/note/notas/notes/notizen/main/MainActivity$c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/b;->a(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v()V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f01000c

    const/4 v2, 0x0

    const v3, 0x7f08005a

    if-ne v0, v3, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v1, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080055

    const v4, 0x7f01000d

    if-ne v0, v3, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/SelectNoteActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x6

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0, v4, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080073

    if-ne v0, v3, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/setting/SettingActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x2

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080068

    if-ne v0, v3, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    invoke-direct {p0, v2}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->a(Z)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080066

    if-ne v0, v3, :cond_9

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/note/view/DeleteNoteActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x4

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f08005b

    const v5, 0x7f01000f

    if-ne v0, v3, :cond_b

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_a

    return-void

    :cond_a
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "type"

    const-string v2, "main"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    invoke-virtual {p0, v1, v5}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f08007c

    if-ne v0, v3, :cond_d

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_c

    return-void

    :cond_c
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f010011

    invoke-virtual {p0, p1, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_3

    :cond_d
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f08006d

    if-ne v0, v3, :cond_f

    sget-boolean p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->t()V

    goto :goto_3

    :cond_e
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->s()V

    goto :goto_3

    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080064

    if-ne v0, v3, :cond_11

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_10

    return-void

    :cond_10
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_11
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080081

    if-ne p1, v0, :cond_14

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-eqz p1, :cond_13

    sget-boolean p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-eqz p1, :cond_12

    goto :goto_2

    :cond_12
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/main/SortActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v0, 0x8

    goto/16 :goto_0

    :cond_13
    :goto_2
    sget-boolean p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-eqz p1, :cond_14

    const-string p1, "Can\'t change sorting at the favorites."

    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_14
    :goto_3
    return-void
.end method

.method public o()V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->C:Lb/a/a/a/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->C:Lb/a/a/a/a;

    const/4 v3, 0x3

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "remove_ads"

    const-string v6, "inapp"

    const-string v7, "bGoa+V7g/yqDXvKRqq+JTFn4uQZbPiQJo4pf9RzJ"

    invoke-interface/range {v2 .. v7}, Lb/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "BUY_INTENT"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v3

    const/4 v4, 0x3

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Landroidx/fragment/app/d;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    goto :goto_1

    :cond_0
    const-string v0, "Failed..Please, restart app.."

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_1
    const-string v0, "Please, restart app and try again."

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_b

    const/4 p2, 0x1

    const-string v0, "categoryId"

    const/4 v1, 0x0

    if-ne p1, p2, :cond_0

    sput-boolean v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->A:Landroid/widget/ImageView;

    const v2, 0x7f070076

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const-string p1, "isAllNotes"

    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    sput-boolean p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    sput p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    goto/16 :goto_3

    :cond_0
    const/4 p2, 0x2

    const-string v2, "type"

    if-ne p1, p2, :cond_1

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "removeAds"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->o()V

    goto/16 :goto_3

    :cond_1
    const/4 p2, 0x3

    if-ne p1, p2, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_3

    :cond_2
    const/4 p2, 0x4

    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/b/d;->a()V

    goto/16 :goto_3

    :cond_3
    const/4 p2, 0x5

    if-ne p1, p2, :cond_4

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p2, p1}, Lc/a/a/a/a/b/b/d;->f(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/b/d;->e()V

    const-string p1, "Success"

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_3

    :cond_4
    const/4 p2, 0x6

    const v3, 0x7f01000f

    const v4, 0x7f010011

    const/4 v5, 0x7

    if-ne p1, p2, :cond_6

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "note"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget p2, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    invoke-virtual {p0, v4, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_5
    const-string p2, "checklist"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget p2, Lnotepad/note/notas/notes/notizen/main/MainActivity;->H:I

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1, v5}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000d

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_3

    :cond_6
    if-ne p1, v5, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/b/d;->b()I

    move-result p1

    if-eqz p1, :cond_b

    new-instance p2, Landroid/content/Intent;

    const-class p3, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;

    invoke-direct {p2, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "noteId"

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_7
    const/16 p2, 0x8

    if-ne p1, p2, :cond_b

    const-string p1, "SETTING"

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "sort"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "title"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->b:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    sput-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const-string p3, "TITLE"

    :goto_1
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_2

    :cond_8
    const-string v0, "editedTime"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->c:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    sput-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const-string p3, "EDITED_TIME"

    goto :goto_1

    :cond_9
    const-string v0, "createdTime"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    sget-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity$c;->d:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    sput-object p3, Lnotepad/note/notas/notes/notizen/main/MainActivity;->G:Lnotepad/note/notas/notes/notizen/main/MainActivity$c;

    const-string p3, "CREATED_TIME"

    goto :goto_1

    :cond_a
    :goto_2
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_b
    :goto_3
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->I:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->t()V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->y:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->a(Z)V

    goto :goto_0

    :cond_1
    sget-boolean v0, Lnotepad/note/notas/notes/notizen/main/MainActivity;->J:Z

    if-eqz v0, :cond_2

    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->w()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->r()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->u()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/d;->onResume()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->q()V

    return-void
.end method
