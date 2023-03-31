.class public final Lb/c/b/a/d/a$a$a;
.super Lb/c/b/a/e/e/b;
.source ""

# interfaces
.implements Lb/c/b/a/d/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/b/a/d/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-direct {p0, p1, v0}, Lb/c/b/a/e/e/b;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method
