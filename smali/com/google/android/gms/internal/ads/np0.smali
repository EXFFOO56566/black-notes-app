.class public final Lcom/google/android/gms/internal/ads/np0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Landroid/content/pm/PackageInfo;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lb/c/b/a/c/q/c;->a(Landroid/content/Context;)Lb/c/b/a/c/q/b;

    move-result-object p0

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lb/c/b/a/c/q/b;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
