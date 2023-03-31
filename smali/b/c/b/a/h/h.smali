.class public final Lb/c/b/a/h/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/b/a/h/h$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/c/b/a/h/h$a;

    invoke-direct {v0}, Lb/c/b/a/h/h$a;-><init>()V

    sput-object v0, Lb/c/b/a/h/h;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lb/c/b/a/h/t;

    invoke-direct {v0}, Lb/c/b/a/h/t;-><init>()V

    sput-object v0, Lb/c/b/a/h/h;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
