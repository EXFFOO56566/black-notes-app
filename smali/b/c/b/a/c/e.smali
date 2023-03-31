.class public Lb/c/b/a/c/e;
.super Lb/c/b/a/c/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/b/a/c/e$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/Object;

.field private static final e:Lb/c/b/a/c/e;


# instance fields
.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb/c/b/a/c/e;->d:Ljava/lang/Object;

    new-instance v0, Lb/c/b/a/c/e;

    invoke-direct {v0}, Lb/c/b/a/c/e;-><init>()V

    sput-object v0, Lb/c/b/a/c/e;->e:Lb/c/b/a/c/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/c/b/a/c/f;-><init>()V

    return-void
.end method

.method static a(Landroid/content/Context;ILcom/google/android/gms/common/internal/f;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x1010309

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Theme.Dialog.Alert"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    :cond_1
    if-nez v0, :cond_2

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    :cond_2
    invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/e;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    if-eqz p3, :cond_3

    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    :cond_3
    invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/e;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {v0, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_4
    invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/e;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    return-object p0
.end method

.method public static a()Lb/c/b/a/c/e;
    .locals 1

    sget-object v0, Lb/c/b/a/c/e;->e:Lb/c/b/a/c/e;

    return-object v0
.end method

.method static a(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    instance-of v0, p0, Landroidx/fragment/app/d;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/d;

    invoke-virtual {p0}, Landroidx/fragment/app/d;->g()Landroidx/fragment/app/i;

    move-result-object p0

    invoke-static {p1, p3}, Lb/c/b/a/c/m;->a(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lb/c/b/a/c/m;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lb/c/b/a/c/m;->a(Landroidx/fragment/app/i;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-static {p1, p3}, Lb/c/b/a/c/c;->a(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lb/c/b/a/c/c;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lb/c/b/a/c/c;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method private final a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    const/16 p3, 0x12

    if-ne p2, p3, :cond_0

    invoke-virtual {p0, p1}, Lb/c/b/a/c/e;->c(Landroid/content/Context;)V

    return-void

    :cond_0
    if-nez p4, :cond_2

    const/4 p1, 0x6

    if-ne p2, p1, :cond_1

    const-string p1, "GoogleApiAvailability"

    const-string p2, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void

    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/e;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/e;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "notification"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    new-instance v3, Landroidx/core/app/h$c;

    invoke-direct {v3, p1}, Landroidx/core/app/h$c;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroidx/core/app/h$c;->b(Z)Landroidx/core/app/h$c;

    invoke-virtual {v3, v4}, Landroidx/core/app/h$c;->a(Z)Landroidx/core/app/h$c;

    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->b(Ljava/lang/CharSequence;)Landroidx/core/app/h$c;

    new-instance p3, Landroidx/core/app/h$b;

    invoke-direct {p3}, Landroidx/core/app/h$b;-><init>()V

    invoke-virtual {p3, v0}, Landroidx/core/app/h$b;->a(Ljava/lang/CharSequence;)Landroidx/core/app/h$b;

    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->a(Landroidx/core/app/h$d;)Landroidx/core/app/h$c;

    invoke-static {p1}, Lcom/google/android/gms/common/util/h;->c(Landroid/content/Context;)Z

    move-result p3

    const/4 v5, 0x2

    if-eqz p3, :cond_4

    invoke-static {}, Lcom/google/android/gms/common/util/l;->g()Z

    move-result p3

    invoke-static {p3}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    iget p3, p3, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->b(I)Landroidx/core/app/h$c;

    invoke-virtual {v3, v5}, Landroidx/core/app/h$c;->a(I)Landroidx/core/app/h$c;

    invoke-static {p1}, Lcom/google/android/gms/common/util/h;->d(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_3

    sget p3, Lb/c/b/a/b/a;->common_full_open_on_phone:I

    sget v0, Lb/c/b/a/b/b;->common_open_on_phone:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, p3, v0, p4}, Landroidx/core/app/h$c;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/h$c;

    goto :goto_0

    :cond_3
    invoke-virtual {v3, p4}, Landroidx/core/app/h$c;->a(Landroid/app/PendingIntent;)Landroidx/core/app/h$c;

    goto :goto_0

    :cond_4
    const p3, 0x108008a

    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->b(I)Landroidx/core/app/h$c;

    sget p3, Lb/c/b/a/b/b;->common_google_play_services_notification_ticker:I

    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->c(Ljava/lang/CharSequence;)Landroidx/core/app/h$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Landroidx/core/app/h$c;->a(J)Landroidx/core/app/h$c;

    invoke-virtual {v3, p4}, Landroidx/core/app/h$c;->a(Landroid/app/PendingIntent;)Landroidx/core/app/h$c;

    invoke-virtual {v3, v0}, Landroidx/core/app/h$c;->a(Ljava/lang/CharSequence;)Landroidx/core/app/h$c;

    :goto_0
    invoke-static {}, Lcom/google/android/gms/common/util/l;->k()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {}, Lcom/google/android/gms/common/util/l;->k()Z

    move-result p3

    invoke-static {p3}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    invoke-direct {p0}, Lb/c/b/a/c/e;->b()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_6

    const-string p3, "com.google.android.gms.availability"

    invoke-virtual {v2, p3}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-nez p4, :cond_5

    new-instance p4, Landroid/app/NotificationChannel;

    const/4 v0, 0x4

    invoke-direct {p4, p3, p1, v0}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    :goto_1
    invoke-virtual {v2, p4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p4}, Landroid/app/NotificationChannel;->getName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p4, p1}, Landroid/app/NotificationChannel;->setName(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_6
    :goto_2
    invoke-virtual {v3, p3}, Landroidx/core/app/h$c;->a(Ljava/lang/String;)Landroidx/core/app/h$c;

    :cond_7
    invoke-virtual {v3}, Landroidx/core/app/h$c;->a()Landroid/app/Notification;

    move-result-object p1

    if-eq p2, v4, :cond_8

    if-eq p2, v5, :cond_8

    const/4 p3, 0x3

    if-eq p2, p3, :cond_8

    const p2, 0x9b6d

    goto :goto_3

    :cond_8
    const/16 p2, 0x28c4

    sget-object p3, Lb/c/b/a/c/j;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :goto_3
    invoke-virtual {v2, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private final b()Ljava/lang/String;
    .locals 2

    sget-object v0, Lb/c/b/a/c/e;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb/c/b/a/c/e;->c:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Landroid/content/Context;I)I
    .locals 0

    invoke-super {p0, p1, p2}, Lb/c/b/a/c/f;->a(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public a(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;
    .locals 1

    const-string v0, "d"

    invoke-virtual {p0, p1, p2, v0}, Lb/c/b/a/c/e;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p1, v0, p3}, Lcom/google/android/gms/common/internal/f;->a(Landroid/app/Activity;Landroid/content/Intent;I)Lcom/google/android/gms/common/internal/f;

    move-result-object p3

    invoke-static {p1, p2, p3, p4}, Lb/c/b/a/c/e;->a(Landroid/content/Context;ILcom/google/android/gms/common/internal/f;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;II)Landroid/app/PendingIntent;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lb/c/b/a/c/f;->a(Landroid/content/Context;II)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Lb/c/b/a/c/b;)Landroid/app/PendingIntent;
    .locals 1

    invoke-virtual {p2}, Lb/c/b/a/c/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/c/b/a/c/b;->g()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lb/c/b/a/c/b;->d()I

    move-result p2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lb/c/b/a/c/e;->a(Landroid/content/Context;II)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lb/c/b/a/c/f;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final a(I)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lb/c/b/a/c/f;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Lb/c/b/a/c/b;I)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, Lb/c/b/a/c/e;->a(Landroid/content/Context;Lb/c/b/a/c/b;)Landroid/app/PendingIntent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/c/b/a/c/b;->d()I

    move-result p2

    const/4 v1, 0x0

    invoke-static {p1, v0, p3}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;I)Landroid/app/PendingIntent;

    move-result-object p3

    invoke-direct {p0, p1, p2, v1, p3}, Lb/c/b/a/c/e;->a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Landroid/content/Context;)I
    .locals 0

    invoke-super {p0, p1}, Lb/c/b/a/c/f;->b(Landroid/content/Context;)I

    move-result p1

    return p1
.end method

.method public b(Landroid/content/Context;I)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "n"

    invoke-virtual {p0, p1, p2, v0, v1}, Lb/c/b/a/c/f;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lb/c/b/a/c/e;->a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public final b(I)Z
    .locals 0

    invoke-super {p0, p1}, Lb/c/b/a/c/f;->b(I)Z

    move-result p1

    return p1
.end method

.method public b(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lb/c/b/a/c/e;->a(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string p3, "GooglePlayServicesErrorDialog"

    invoke-static {p1, p2, p3, p4}, Lb/c/b/a/c/e;->a(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    const/4 p1, 0x1

    return p1
.end method

.method final c(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lb/c/b/a/c/e$a;

    invoke-direct {v0, p0, p1}, Lb/c/b/a/c/e$a;-><init>(Lb/c/b/a/c/e;Landroid/content/Context;)V

    const/4 p1, 0x1

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
